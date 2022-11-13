package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.UserConverter;
import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.Repository.UserRepository;
import com.example.project.BookMyShow.Service.UserService;
import com.example.project.BookMyShow.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity= UserConverter.convertDtoToEntity(userDto) ;
        userRepository.save(userEntity);
    }



    @Override
    public UserDto getUser(int id) {
        UserEntity userEntity=userRepository.findById(id).get();
        UserDto userDto= UserConverter.convertEntityToDto(userEntity);
        return userDto;
    }
}
