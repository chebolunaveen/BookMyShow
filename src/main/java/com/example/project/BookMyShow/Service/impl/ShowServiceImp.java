package com.example.project.BookMyShow.Service.impl;


import com.example.project.BookMyShow.Converter.ShowConverter;
import com.example.project.BookMyShow.Models.*;
import com.example.project.BookMyShow.Repository.MovieRepository;
import com.example.project.BookMyShow.Repository.ShowRepository;
import com.example.project.BookMyShow.Repository.ShowSeatsRepository;
import com.example.project.BookMyShow.Repository.TheatreRepository;
import com.example.project.BookMyShow.Service.ShowService;
import com.example.project.BookMyShow.dto.EntryTRequestDto.ShowEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.project.BookMyShow.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShowServiceImp implements ShowService {
    @Autowired
    ShowRepository showRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    ShowSeatsRepository showSeatsRepository;
    @Override
    public ShowResponseDto addShow(ShowEntryDto showEntryDto) {
        //we have made the partial show entity object
        // Goal: set the movie and Theater entities and not the Dto
        ShowEntity showEntity= ShowConverter.convertEntityToDto(showEntryDto);

        //MovieEntity
        MovieEntity movieEntity=movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();
        TheatreEntity theatreEntity=theatreRepository.findById(showEntryDto.getTheatreResponseDto().getId()).get();


        showEntity.setMovie(movieEntity);
        showEntity.setTheatre(theatreEntity);

        //we need to pass list of theatre seats
        generateShowEntitySeats(theatreEntity.getSeats(),showEntity);

        showEntity=showRepository.save(showEntity);
        //create a showResponseDto
        ShowResponseDto showResponseDto=ShowConverter.convertEntityToDto(showEntity,showEntryDto);
        return showResponseDto;

    }public void generateShowEntitySeats(List<TheatreSeatEntity> theatreSeatEntityList,ShowEntity showEntity){
        List<ShowSeatsEntity> showSeatsEntityList=new ArrayList<>();

        //all seats in theatre
        for(TheatreSeatEntity t:theatreSeatEntityList){
            //to create seats
            ShowSeatsEntity showSeatsEntity=ShowSeatsEntity.builder().seatNo(t.getSeatNumber()).rate(t.getRate()).SeatType(t.getSeatType()).build();
                    showSeatsEntityList.add(showSeatsEntity);
        }
        //need to set show Entity for each of the showseat
        showSeatsRepository.saveAll(showSeatsEntityList);
        for(ShowSeatsEntity showSeatsEntity:showSeatsEntityList){
            showSeatsEntity.setShow(showEntity);

        }
        showEntity.setSeats(showSeatsEntityList);
    }

}
