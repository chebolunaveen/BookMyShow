package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.ShowEntity;
import com.example.project.BookMyShow.dto.EntryTRequestDto.ShowEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.project.BookMyShow.dto.ShowDto;

public class ShowConverter {
    public static ShowEntity convertEntityToDto(ShowEntryDto showEntryDto){
        return ShowEntity.builder().showdate(showEntryDto.getShowDate()).showTime(showEntryDto.getShowtime()).build();
    }

    public static ShowResponseDto convertEntityToDto(ShowEntity showEntity,ShowEntryDto showEntryDto){
        return ShowResponseDto.builder().id(showEntity.getId()).showDate(showEntity.getShowdate()).showTime(showEntity.getShowTime()).
                movieResponseDto(showEntryDto.getMovieResponseDto()).theatreResponseDto(showEntryDto.getTheatreResponseDto()).build();
    }
}
