package com.example.project.BookMyShow.Converter;


import com.example.project.BookMyShow.Models.TheatreEntity;
import com.example.project.BookMyShow.dto.EntryTRequestDto.TheatreEntryDto;
import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.ResponseDto.TheatreResponseDto;
import com.example.project.BookMyShow.dto.TheatreDto;

public class TheatreConverter {
    public static TheatreEntity convertDtoToEntity(TheatreEntryDto theatreEntryDto){
        return TheatreEntity.builder().address(theatreEntryDto.getAddress()).city(theatreEntryDto.getCity()).
                name(theatreEntryDto.getName()).build();
    }

    public static TheatreResponseDto convertEntityToDto(TheatreEntity theatreEntity){
        return TheatreResponseDto.builder().id(theatreEntity.getId()).name(theatreEntity.getName()).address(theatreEntity.getAddress()).
                city(theatreEntity.getCity()).type(theatreEntity.getType()).build();
    }
}
