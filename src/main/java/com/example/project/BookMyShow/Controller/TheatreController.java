package com.example.project.BookMyShow.Controller;

import com.example.project.BookMyShow.Service.impl.TheatreServiceImp;
import com.example.project.BookMyShow.dto.EntryTRequestDto.TheatreEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.TheatreResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theatre")
public class TheatreController {
    @Autowired
    TheatreServiceImp theatreServiceImp;

    @PostMapping("/add")
    public TheatreResponseDto addTheatre(@RequestBody()TheatreEntryDto theatreEntryDto){
        return theatreServiceImp.addTheatre(theatreEntryDto);
    }
}
