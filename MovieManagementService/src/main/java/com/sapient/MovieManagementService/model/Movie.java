package com.sapient.MovieManagementService.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
//@Entity
//@Table(name = "Movie")
public class Movie {
//    @jakarta.persistence.Id
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(name = "title")
    private String title;
    //@Column(name = "language")
    private String language;
   // @Column(name = "genre")
    private String genre;

    public Movie(Long id, String title, String language, String genre) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.genre = genre;
    }
}
