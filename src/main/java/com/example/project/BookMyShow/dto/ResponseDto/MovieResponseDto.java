package com.example.project.BookMyShow.dto.ResponseDto;

import com.example.project.BookMyShow.dto.ShowDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieResponseDto {

    int id;
    String name;
    LocalDate releaseDate;

    //optional
    List<ShowDto> showDtoList;
}
