package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.EntryTRequestDto.TheatreEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.TheatreResponseDto;
import com.example.project.BookMyShow.dto.TheatreDto;

public interface TheatreService {
  TheatreResponseDto addTheatre(TheatreEntryDto theatreEntryDto);

  TheatreResponseDto getTheatre(int id);
}
