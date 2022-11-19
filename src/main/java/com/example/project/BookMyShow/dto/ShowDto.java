package com.example.project.BookMyShow.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowDto {
    int id;
    LocalDate showDate;
    LocalTime showTIME;

    @NotNull
    MovieDto movieDto;
    TheatreDto theatreDto;
}
