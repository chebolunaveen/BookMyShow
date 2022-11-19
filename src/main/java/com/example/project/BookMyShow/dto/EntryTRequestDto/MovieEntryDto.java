package com.example.project.BookMyShow.dto.EntryTRequestDto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class MovieEntryDto {
 String name;
 LocalDate releaseDate;
}
