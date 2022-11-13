package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.UserDto;


public interface UserService {

        //all functions
    void addUser(UserDto userDto);

    UserDto getUser(int id);
}
