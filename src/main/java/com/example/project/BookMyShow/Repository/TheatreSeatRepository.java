package com.example.project.BookMyShow.Repository;

import com.example.project.BookMyShow.Models.TheatreSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository<TheatreSeatEntity,Integer> {
}
