package com.example.project.BookMyShow.dto;



import com.example.project.BookMyShow.enums.SeatType;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Data
@Builder
public class BookTicketRequestDto {
    //it contains mix of different class Attributes
     Set<String> requestedbSeats;//user will give
    int id;//user id who is booking ticket :userEntity
    int showId ; //showEntity
    SeatType seatType;//TheatreSeatEntity


}
