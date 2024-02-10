package com.sapient.BookingManagementService.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
@Setter
@Getter
public class BookingRequest {
    private Long theaterId;
    private Long movieId;
    private LocalDateTime bookingTime;
}
