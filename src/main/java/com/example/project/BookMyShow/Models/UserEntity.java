package com.example.project.BookMyShow.Models;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable=false)
    private String name;
    @Column(name="mobileno",nullable = false)
    private String mobileno;

     @OneToMany(cascade=CascadeType.ALL)//this is by default bi-directional (primary-secondary)
   private List<TicketEntity> listOfTickets;


}
