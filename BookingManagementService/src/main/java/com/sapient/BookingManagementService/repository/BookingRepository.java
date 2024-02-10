package com.sapient.BookingManagementService.repository;

import com.sapient.BookingManagementService.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// BookingRepository.java
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom queries if needed
}
