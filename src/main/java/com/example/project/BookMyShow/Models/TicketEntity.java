package com.example.project.BookMyShow.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String alloted_seats;

    int amount;
//TicketEntity is child class of UserEntity
    @ManyToOne
    @JsonIgnore
    @JoinColumn
    UserEntity user;

    //TicketEntity is parentclass  of UserEntity
    @OneToMany(cascade=CascadeType.ALL)
    @JsonIgnore
    List<ShowSeatsEntity> listOfSeats;

    //it is child class to showentity
    @OneToMany
    @JsonIgnore
    private ShowEntity show;

}
