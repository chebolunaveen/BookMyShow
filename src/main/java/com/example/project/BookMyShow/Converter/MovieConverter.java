package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.MovieEntity;
import com.example.project.BookMyShow.dto.MovieDto;

public class MovieConverter {
    public static MovieEntity ConvertDtoToEntity(MovieDto movieDto){
        return MovieEntity.builder().id(movieDto.getId()).name(movieDto.getName()).
                releaseDate(movieDto.getReleaseDate()).build();

    }
    public static MovieDto ConvertEntityToDto(MovieEntity movieEntity){
        return MovieDto.builder().id(movieEntity.getId()).name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).build();

    }
}
