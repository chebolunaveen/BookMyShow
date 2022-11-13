package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.MovieConverter;
import com.example.project.BookMyShow.Models.MovieEntity;
import com.example.project.BookMyShow.Repository.MovieRepository;
import com.example.project.BookMyShow.Service.MovieService;
import com.example.project.BookMyShow.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieServiceImp implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public MovieDto addMovie(MovieDto movieDto) {


        MovieEntity movieEntity= MovieConverter.ConvertDtoToEntity(movieDto);
      //  MovieEntity movieEntity1=movieRepository.findOne(movieDto.getName()).get();
        movieRepository.save(movieEntity);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movieEntity=movieRepository.findById(id).get();
        //movieRepository.findOne()
        MovieDto movieDto=MovieConverter.ConvertEntityToDto(movieEntity);
        return movieDto;
    }
}
