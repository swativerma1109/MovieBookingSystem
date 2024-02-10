package com.sapient.BookingManagementService.controller;

import com.sapient.BookingManagementService.model.Booking;
import com.sapient.BookingManagementService.model.BookingRequest;
import com.sapient.BookingManagementService.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking makeBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.makeBooking(bookingRequest);
    }

    // Other endpoints for managing bookings

}
