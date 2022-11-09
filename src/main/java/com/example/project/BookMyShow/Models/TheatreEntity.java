package com.example.project.BookMyShow.Models;

import com.example.project.BookMyShow.enums.TheaterType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class TheatreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name="Theater_type",nullable = false)
    private TheaterType type;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="address",nullable = false)
    private String address;

    //it is parent to showentity
    @OneToMany(mappedBy="theater",cascade=CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;

    //it is parent to TheatreSeatEntity
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TheatreSeatEntity> seats;



}
