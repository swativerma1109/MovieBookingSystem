package com.sapient.TheaterManagementService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
@Getter
//@Entity
public class Theater {
//    @jakarta.persistence.Id
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int seatingCapacity;

    public Theater(Long id, String name, String location, int seatingCapacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.seatingCapacity = seatingCapacity;
    }
}