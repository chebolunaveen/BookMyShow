package com.example.project.BookMyShow.Service;

import com.example.project.BookMyShow.dto.BookTicketRequestDto;
import com.example.project.BookMyShow.dto.TicketDto;

public interface TicketService {
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
    TicketDto getTicket(int id);
}
