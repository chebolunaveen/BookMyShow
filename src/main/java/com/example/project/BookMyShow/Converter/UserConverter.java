package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.dto.EntryTRequestDto.UserEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.UserResponseDto;
import com.example.project.BookMyShow.dto.UserDto;
//utility class all methods are static
public class UserConverter {
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){
      return UserEntity.builder().name(userEntryDto.getName()).mobileno(userEntryDto.getMobileNo()).build();

        //second method for creating objects using new keyword

//        UserEntity userEntity=new UserEntity(userDto.getId(), userDto.getName(), userDto.getMobileNo(),userDto.getTicketDtoList());
//        return  userEntity;
    }

    public static UserResponseDto convertEntityToDto(UserEntity user){
        return UserResponseDto.builder().id(user.getId()).name(user.getName()).mobno(user.getMobileno()).build();
    }
}
