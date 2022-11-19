package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.EntryTRequestDto.ShowEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.project.BookMyShow.dto.ShowDto;

public interface ShowService {
    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    //get show
}
