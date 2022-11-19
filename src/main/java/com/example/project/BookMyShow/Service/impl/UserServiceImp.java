package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.UserConverter;
import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.Repository.UserRepository;
import com.example.project.BookMyShow.Service.UserService;
import com.example.project.BookMyShow.dto.EntryTRequestDto.UserEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.UserResponseDto;
import com.example.project.BookMyShow.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public void addUser(UserEntryDto userEnrtryDto) {
        UserEntity userEntity= UserConverter.convertDtoToEntity(userEnrtryDto) ;
        userRepository.save(userEntity);
    }



    @Override
    public UserResponseDto getUser(int id) {
        UserEntity userEntity=userRepository.findById(id).get();
        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(userEntity);
        return userResponseDto;
    }
}
