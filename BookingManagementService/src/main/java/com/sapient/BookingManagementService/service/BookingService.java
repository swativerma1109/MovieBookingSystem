package com.sapient.BookingManagementService.service;

import com.sapient.BookingManagementService.model.Booking;
import com.sapient.BookingManagementService.model.BookingRequest;
import com.sapient.BookingManagementService.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking makeBooking(BookingRequest bookingRequest) {
        // Validate booking request

        // Process booking and save to database
        Booking booking = new Booking();
        // Set booking details from request
        return bookingRepository.save(booking);
    }

    // Other booking operations

}
