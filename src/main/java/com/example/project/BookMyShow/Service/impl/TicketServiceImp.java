package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.TicketConverter;
import com.example.project.BookMyShow.Models.ShowEntity;
import com.example.project.BookMyShow.Models.ShowSeatsEntity;
import com.example.project.BookMyShow.Models.TicketEntity;
import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.Repository.ShowRepository;
import com.example.project.BookMyShow.Repository.TicketRepository;
import com.example.project.BookMyShow.Repository.UserRepository;
import com.example.project.BookMyShow.Service.TicketService;
import com.example.project.BookMyShow.dto.BookTicketRequestDto;
import com.example.project.BookMyShow.dto.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TicketServiceImp implements TicketService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ShowRepository showRepository;
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {
        UserEntity userEntity=userRepository.findById(bookTicketRequestDto.getId()).get();
        ShowEntity showEntity=showRepository.findById(bookTicketRequestDto.getShowId()).get();
        Set<String> requestedSeats=bookTicketRequestDto.getRequestedbSeats();
        List<ShowSeatsEntity> showSeatsEntityList=showEntity.getSeats();

        //step 1
        List<ShowSeatsEntity> bookedSeats=showSeatsEntityList.
                    stream()
                .filter(seat->seat.getSeatType().equals(bookTicketRequestDto.getSeatType()) && !seat.isBooked() && requestedSeats.contains(seat.getSeatNo())).collect(Collectors.toList());

        if(bookedSeats.size()!=requestedSeats.size()){
            throw new Error("All seats are not available");
        }
        //STEP 2 set all details related bookrequest
         TicketEntity ticketEntity=TicketEntity.builder().user(userEntity).show(showEntity).Seats(bookedSeats).build();

          //step 3
         int amount=0;
         for(ShowSeatsEntity showSeatsEntity:bookedSeats){
           showSeatsEntity.setBooked(true);
           showSeatsEntity.setBookedAt(new Date());
           showSeatsEntity.setTicket(ticketEntity);
           amount+=showSeatsEntity.getRate();
         }
         ticketEntity.setAlloted_seats(String.valueOf(bookedSeats));
         ticketEntity.setAmount(amount);

         //connect in the show and user
        showEntity.getTickets().add(ticketEntity);
        //add ticket in ticket list of the usersEntity

        userEntity.getListOfTickets().add(ticketEntity);

        ticketEntity=ticketRepository.save(ticketEntity);

        return TicketConverter.convertEntityToDto(ticketEntity);

    }

    @Override
    public TicketDto getTicket(int id) {
//        TicketEntity ticketEntity=ticketRepository.findById(id).get();
//        TicketDto ticketDto=TicketConverter.convertEntityToDto(ticketEntity);
        return null;
    }
}
