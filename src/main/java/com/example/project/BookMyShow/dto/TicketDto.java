package com.example.project.BookMyShow.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {
    int id;
    String alloted_seats;
    int amount;
}
