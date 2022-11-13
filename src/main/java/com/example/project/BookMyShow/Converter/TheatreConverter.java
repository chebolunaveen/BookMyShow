package com.example.project.BookMyShow.Converter;


import com.example.project.BookMyShow.Models.TheatreEntity;
import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.TheatreDto;

public class TheatreConverter {
    public static TheatreEntity convertDtoToEntity(TheatreDto theatreDto){
        return TheatreEntity.builder().id(theatreDto.getId()).address(theatreDto.getAddress()).city(theatreDto.getCity()).
                name(theatreDto.getName()).build();
    }

    public static TheatreDto convertEntityToDto(TheatreEntity theatreEntity){
        return TheatreDto.builder().id(theatreEntity.getId()).name(theatreEntity.getName()).address(theatreEntity.getAddress()).
                city(theatreEntity.getCity()).build();
    }
}
