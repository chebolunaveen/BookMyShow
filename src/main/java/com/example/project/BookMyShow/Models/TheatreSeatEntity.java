package com.example.project.BookMyShow.Models;

import com.example.project.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TheatreSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="SeatNumber",nullable = false)
    private String SeatNumber;

    @Column(name="rate",nullable=false)
    private int rate;

 @Enumerated(EnumType.STRING)
 @Column(name="seat_type")
   private SeatType seatType;


    //it is childclass to TheatreEntity
    @ManyToOne
    @JsonIgnore
    private TheatreEntity theater;
}
