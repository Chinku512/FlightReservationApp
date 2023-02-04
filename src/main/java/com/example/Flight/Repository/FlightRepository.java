package com.example.Flight.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Flight.Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	 @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	    List<Flight> findFlights(@Param("departureCity")String source, @Param("arrivalCity")String destination,@Param("dateOfDeparture")Date departDate);
	

}
