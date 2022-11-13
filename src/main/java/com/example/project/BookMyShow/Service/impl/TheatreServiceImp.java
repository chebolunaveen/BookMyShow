package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.TheatreConverter;
import com.example.project.BookMyShow.Models.TheatreEntity;
import com.example.project.BookMyShow.Models.TheatreSeatEntity;
import com.example.project.BookMyShow.Repository.TheatreRepository;
import com.example.project.BookMyShow.Repository.TheatreSeatRepository;
import com.example.project.BookMyShow.Service.TheatreService;
import com.example.project.BookMyShow.dto.TheatreDto;
import com.example.project.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TheatreServiceImp implements TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    TheatreSeatRepository theatreSeatRepository;
    @Override
    public TheatreDto addTheatre(TheatreDto theatreDto) {
        TheatreEntity theatreEntity= TheatreConverter.convertDtoToEntity(theatreDto);
        //while creating Theatre to create sats also

        List<TheatreSeatEntity> seats=createTheatreSeats();

        //need to set theatreid for all these seats
        for(TheatreSeatEntity theatreSeatEntity: seats){
            theatreSeatEntity.setTheater(theatreEntity);
        }
        theatreRepository.save(theatreEntity);
        return theatreDto;

    }
List<TheatreSeatEntity> createTheatreSeats(){
        List<TheatreSeatEntity> seats=new ArrayList<>();
        seats.add(getTheatreSeat("1A",100,SeatType.Classic));
        seats.add(getTheatreSeat("1B",100,SeatType.Classic));
        seats.add(getTheatreSeat("1C",100,SeatType.Classic));
        seats.add(getTheatreSeat("1D",100,SeatType.Classic));

    seats.add(getTheatreSeat("2A",100,SeatType.Classic));
    seats.add(getTheatreSeat("2B",100,SeatType.Classic));
    seats.add(getTheatreSeat("2C",100,SeatType.Classic));
    seats.add(getTheatreSeat("2D",100,SeatType.Classic));

    theatreSeatRepository.saveAll(seats);
    return seats;
}
TheatreSeatEntity getTheatreSeat(String seatname , int rate, SeatType seatType){
        return TheatreSeatEntity.builder().SeatNumber(seatname).rate(rate).seatType(seatType).build();
}
    @Override
    public TheatreDto getTheatre(int id) {
       TheatreEntity theatreEntity=theatreRepository.findById(id).get();
       TheatreDto theatreDto=TheatreConverter.convertEntityToDto(theatreEntity);
       return theatreDto;

    }
}
