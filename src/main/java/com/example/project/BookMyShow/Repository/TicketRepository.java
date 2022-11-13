package com.example.project.BookMyShow.Repository;

import com.example.project.BookMyShow.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
