package com.example.project.BookMyShow.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto {
int id;
String name;
LocalDate releaseDate;

List<ShowDto> showDtoList;

}
