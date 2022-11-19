package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.EntryTRequestDto.MovieEntryDto;
import com.example.project.BookMyShow.dto.MovieDto;
import com.example.project.BookMyShow.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    MovieResponseDto getMovie(int id);
}
