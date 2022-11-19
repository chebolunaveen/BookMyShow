package com.example.project.BookMyShow.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.*;

@Builder
@Entity
@Getter
@EntityListeners(value = {AuditingEntityListener.class})
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Tickets")
@ToString
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String alloted_seats;

    int amount;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="booked_at",nullable = false)
      private Date bookedAt;

//TicketEntity is child class of UserEntity
    @ManyToOne
    @JsonIgnore
    @JoinColumn
    UserEntity user;

    //TicketEntity is parentclass  of UserEntity
    @OneToMany(cascade=CascadeType.ALL)
    @JsonIgnore
    List<ShowSeatsEntity> Seats;

    //it is child class to showentity
    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

}
