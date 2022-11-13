package com.example.project.BookMyShow.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class MovieEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="realease_date",columnDefinition = "DATE",nullable = false)
    private LocalDate releaseDate;

    //it is parent to ShowEntity

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;
}
