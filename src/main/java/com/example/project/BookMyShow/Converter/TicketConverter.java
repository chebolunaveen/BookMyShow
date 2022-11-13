package com.example.project.BookMyShow.Converter;

import com.example.project.BookMyShow.Models.TicketEntity;
import com.example.project.BookMyShow.Models.UserEntity;
import com.example.project.BookMyShow.dto.TicketDto;

import java.util.Optional;

public class TicketConverter {
    public static TicketEntity convertDtoToEntity(TicketDto ticketDto){
        return TicketEntity.builder().alloted_seats(ticketDto.getAlloted_seats()).amount(ticketDto.getAmount()).build();
    }

    public static TicketDto convertEntityToDto(TicketEntity ticketDto){
        return TicketDto.builder().id((int) ticketDto.getId()).amount(ticketDto.getAmount()).build();
    }
}
