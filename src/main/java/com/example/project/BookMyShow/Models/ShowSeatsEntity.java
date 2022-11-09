package com.example.project.BookMyShow.Models;

import com.example.project.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="Show_Seats")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShowSeatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="rate",nullable = false)
    private int rate;
    @Column(name="seat_number",nullable = false)
    private String  seatNo;

    @Enumerated(EnumType.STRING)
    @Column(name="seat_type",nullable = false)
    private SeatType SeatType;

    @Column(name="is_booked",columnDefinition ="bit(1) default 0" ,nullable = false)
    boolean booked;

    @Temporal(TemporalType.TIMESTAMP)
 @Column(name="booked_at")
    private Date bookedAt;
    //showseatsentity is child of ticketsentity and showentity

    @ManyToOne
    @JsonIgnore
    private TicketEntity ticket;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;
}
