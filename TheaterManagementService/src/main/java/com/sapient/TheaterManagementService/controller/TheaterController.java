package com.sapient.TheaterManagementService.controller;

import com.sapient.TheaterManagementService.model.Theater;
import com.sapient.TheaterManagementService.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @GetMapping
    public List<Theater> getAllTheatres() {
        return theaterService.getAllTheatres();
    }

    @PostMapping
    public Theater addTheater(@RequestBody Theater theater) {
        return theaterService.addTheater(theater);
    }

    // Other CRUD endpoints for managing theaters

}