package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.MovieEntity;
import com.example.project.BookMyShow.dto.EntryTRequestDto.MovieEntryDto;
import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.ResponseDto.MovieResponseDto;

public class MovieConverter {
    public static MovieEntity ConvertDtoToEntity(MovieEntryDto movieEntryDto){
        return MovieEntity.builder().name(movieEntryDto.getName()).releaseDate(movieEntryDto.getReleaseDate()).build();


    }
    public static MovieResponseDto ConvertEntityToDto(MovieEntity movieEntity){
        return MovieResponseDto.builder().id(movieEntity.getId()).name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).build();

    }
}
