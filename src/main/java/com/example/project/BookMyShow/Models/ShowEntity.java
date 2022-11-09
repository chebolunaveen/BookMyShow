package com.example.project.BookMyShow.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="show_date",columnDefinition = "DATE",nullable = false)
    private LocalDate Showdate;

    @Column(name="created_at",columnDefinition = "TIME",nullable = false)
    private LocalTime showTime;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name="Created_at")
    private Date CreatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name="updated_at")
    private Date updatedAt;

    //it is child class to theatrentity
    @ManyToOne
    @JsonIgnore
    private TheatreEntity theater;

    //it is parent class to ticketentity
    @OneToMany(cascade=CascadeType.ALL)
    @JsonIgnore
    private List<TicketEntity> tickets;

    //it is parent class to showseatsentity
    @ManyToOne(cascade=CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;

    //it is child to TheatreEntity
    @ManyToOne
    @JsonIgnore

    private TheatreEntity theatre;

    //it is child class to Movieentity

    @ManyToOne
    @JsonIgnore
    private MovieEntity movie;

}
