package com.example.project.BookMyShow.Repository;

import com.example.project.BookMyShow.Models.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
