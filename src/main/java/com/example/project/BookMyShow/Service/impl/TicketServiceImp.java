package com.example.project.BookMyShow.Service.impl;

import com.example.project.BookMyShow.Converter.TicketConverter;
import com.example.project.BookMyShow.Models.TicketEntity;
import com.example.project.BookMyShow.Repository.TicketRepository;
import com.example.project.BookMyShow.Service.TicketService;
import com.example.project.BookMyShow.dto.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TicketServiceImp implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public void addTicket(TicketDto ticketDto) {

        TicketEntity ticketEntity=TicketConverter.convertDtoToEntity(ticketDto);
        ticketRepository.save(ticketEntity);
    }

    @Override
    public TicketDto getTicket(int id) {
        TicketEntity ticketEntity=ticketRepository.findById(id).get();
        TicketDto ticketDto=TicketConverter.convertEntityToDto(ticketEntity);
        return ticketDto;
    }
}
