package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.EntryTRequestDto.UserEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.UserResponseDto;
import com.example.project.BookMyShow.dto.UserDto;


public interface UserService {

        //all functions
    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);
}
