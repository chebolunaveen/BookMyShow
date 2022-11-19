package com.example.project.BookMyShow.Controller;

import com.example.project.BookMyShow.Service.impl.UserServiceImp;
import com.example.project.BookMyShow.dto.EntryTRequestDto.UserEntryDto;
import com.example.project.BookMyShow.dto.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImp userServiceImp;

    @PostMapping("add")
    public ResponseEntity addUser(@RequestBody UserEntryDto userEntryDto){
        userServiceImp.addUser(userEntryDto);
        return new ResponseEntity<>("Added user", HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDto> getuser(@PathVariable(value="id") int id){
        UserResponseDto userResponseDto=userServiceImp.getUser(id);
        return new ResponseEntity<>(userResponseDto,HttpStatus.OK);
    }

}
