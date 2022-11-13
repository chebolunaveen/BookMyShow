package com.example.project.BookMyShow.dto;

import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    int id;
    @NotNull
   String name;
    @NotNull
   String mobileNo;

    List<TicketDto> ticketDtoList;

}
