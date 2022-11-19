package com.example.project.BookMyShow.dto.ResponseDto;

import com.example.project.BookMyShow.enums.TheatreType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheatreResponseDto {
    int id;
    String name;
    String address;
    String city;
    TheatreType type;
}
