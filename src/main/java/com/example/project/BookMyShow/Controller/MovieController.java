package com.example.project.BookMyShow.Controller;

import com.example.project.BookMyShow.Service.impl.MovieServiceImp;
import com.example.project.BookMyShow.Service.impl.UserServiceImp;
import com.example.project.BookMyShow.dto.EntryTRequestDto.MovieEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.MovieResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
@Autowired
    MovieServiceImp movieServiceImp;

@PostMapping("/add")
    public MovieResponseDto addMovie(@RequestBody() MovieEntryDto movieEntryDto){
      return movieServiceImp.addMovie(movieEntryDto);
}

}
