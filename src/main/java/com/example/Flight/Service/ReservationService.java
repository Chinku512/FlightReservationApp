package com.example.Flight.Service;

import com.example.Flight.DTO.ReservationRequest;
import com.example.Flight.Entity.Reservation;

public interface ReservationService {
	Reservation bookFlight (ReservationRequest request);
}
