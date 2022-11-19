package com.example.project.BookMyShow.Repository;

import com.example.project.BookMyShow.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

//   boolean getMovieEntityByName(String name);


}
