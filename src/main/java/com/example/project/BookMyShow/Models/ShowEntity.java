package com.example.project.BookMyShow.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="shows")
@EntityListeners(value={AuditingEntityListener.class})
@ToString
public class ShowEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="show_date",columnDefinition = "DATE",nullable = false)
    private LocalDate showdate;

    @Column(name="show_Time",columnDefinition = "TIME",nullable = false)
    private LocalTime showTime;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name="created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name="updated_at")
    private Date updatedAt;

    //it is child class to theatrentity
    @ManyToOne
    @JsonIgnore
    private TheatreEntity theatre;

    //it is parent class to ticketentity
    @OneToMany(cascade=CascadeType.ALL)
    @JsonIgnore
    private List<TicketEntity> tickets;

    //it is parent class to showseatsentity
    @OneToMany( cascade=CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;

    //it is child to TheatreEntity
//    @ManyToOne
//    @JsonIgnore
//
//    private TheatreEntity theatre;

    //it is child class to Movieentity

    @ManyToOne
    @JsonIgnore
    private MovieEntity movie;

}
