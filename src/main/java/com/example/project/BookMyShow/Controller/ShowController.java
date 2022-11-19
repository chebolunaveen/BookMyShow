package com.example.project.BookMyShow.Controller;

import com.example.project.BookMyShow.Repository.ShowRepository;
import com.example.project.BookMyShow.Service.impl.ShowServiceImp;
import com.example.project.BookMyShow.dto.EntryTRequestDto.ShowEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.ShowResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("show")
public class ShowController {
    @Autowired
    ShowServiceImp showServiceImp;
    @PostMapping("add")
    public ShowResponseDto addShow(@RequestBody() ShowEntryDto showEntryDto){
        return showServiceImp.addShow(showEntryDto);
    }
}
