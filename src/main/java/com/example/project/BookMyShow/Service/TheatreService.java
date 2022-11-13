package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.TheatreDto;

public interface TheatreService {
  TheatreDto addTheatre(TheatreDto theatreDto);

  TheatreDto getTheatre(int id);
}
