package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.MovieDto;

public interface MovieService {
    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovie(int id);
}
