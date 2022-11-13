package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.TicketDto;

public interface TicketService {
    void addTicket(TicketDto ticketDto);
    TicketDto getTicket(int id);
}
