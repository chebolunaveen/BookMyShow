package com.example.project.BookMyShow.dto.ResponseDto;

import com.example.project.BookMyShow.dto.TicketDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponseDto {
int id;
String name;
String mobno;

//optional
    List<TicketDto> tickets;
}
