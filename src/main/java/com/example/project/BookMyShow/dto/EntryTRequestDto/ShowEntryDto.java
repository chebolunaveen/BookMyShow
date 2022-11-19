package com.example.project.BookMyShow.dto.EntryTRequestDto;

import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.ResponseDto.MovieResponseDto;
import com.example.project.BookMyShow.dto.ResponseDto.TheatreResponseDto;
import com.example.project.BookMyShow.dto.TheatreDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder

public class ShowEntryDto {
    @NotNull
    LocalDate showDate;
    @NotNull
    LocalTime showtime;
    @NotNull
    MovieResponseDto movieResponseDto;
    @NotNull
    TheatreResponseDto theatreResponseDto;
}
