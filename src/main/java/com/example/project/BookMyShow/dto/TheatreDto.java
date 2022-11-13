package com.example.project.BookMyShow.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TheatreDto {
 int id;
 String name;
 String address;
 String city;

ShowDto showdto;
}
