package com.example.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flight.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
