package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.dto.UserDto;
//utility class all methods are static
public class UserConverter {
    public static UserEntity convertDtoToEntity(UserDto userDto){
      return UserEntity.builder().name(userDto.getName()).mobileno(userDto.getMobileNo()).build();

        //second method for creating objects using new keyword

//        UserEntity userEntity=new UserEntity(userDto.getId(), userDto.getName(), userDto.getMobileNo(),userDto.getTicketDtoList());
//        return  userEntity;
    }

    public static UserDto convertEntityToDto(UserEntity user){
        return UserDto.builder().id(user.getId()).name(user.getName()).mobileNo(user.getMobileno()).build();
    }
}
