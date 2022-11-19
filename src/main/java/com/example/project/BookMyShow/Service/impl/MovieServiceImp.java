package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.MovieConverter;
import com.example.project.BookMyShow.Exceptions.DuplicateEntityException;
import com.example.project.BookMyShow.Models.MovieEntity;
import com.example.project.BookMyShow.Repository.MovieRepository;
import com.example.project.BookMyShow.Service.MovieService;
import com.example.project.BookMyShow.dto.EntryTRequestDto.MovieEntryDto;
import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.ResponseDto.MovieResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {
    //check if movie name is present in database or not if present return exception
        if(movieRepository.count()>0){
           List<MovieEntity> all =movieRepository.findAll();
           for(MovieEntity movieEntity:all){
               if(movieEntity.getName().equals(movieEntity.getName())){
                   throw new DuplicateEntityException("movie is already added");
               }
           }
        }

//        if(movieRepository.getMovieEntityByName(movieEntryDto.getName())==true){
//            throw new DuplicateEntityException("movie name already exists");
//        }

        MovieEntity movieEntity= MovieConverter.ConvertDtoToEntity(movieEntryDto);
        movieRepository.save(movieEntity);

        MovieResponseDto movieResponseDto=MovieConverter.ConvertEntityToDto(movieEntity);
        return movieResponseDto;

     //check movie exist or not

    }

    @Override
    public MovieResponseDto getMovie(int id) {
        MovieEntity movieEntity=movieRepository.findById(id).get();
        //movieRepository.findOne()
        MovieResponseDto movieResponseDto=MovieConverter.ConvertEntityToDto(movieEntity);
        return movieResponseDto;
    }
}