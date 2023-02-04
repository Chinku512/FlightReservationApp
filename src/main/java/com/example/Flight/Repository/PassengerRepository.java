package com.example.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flight.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
