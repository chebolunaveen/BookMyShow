package com.example.project.BookMyShow.dto.EntryTRequestDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {
    @NotNull
    String name;
    @NotNull
    String mobileNo;
}
