package com.example.Flight.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flight.DTO.ReservationRequest;
import com.example.Flight.Entity.Flight;
import com.example.Flight.Entity.Passenger;
import com.example.Flight.Entity.Reservation;
import com.example.Flight.Repository.FlightRepository;
import com.example.Flight.Repository.PassengerRepository;
import com.example.Flight.Repository.ReservationRepository;
import com.example.Flight.Utility.EmailUtil;
import com.example.Flight.Utility.PDFgenerator;
@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	PDFgenerator PDFgenerator;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		String filePath= "D:\\sts\\STS WorkSpace\\Flight\\TICKETS\\reservation"+".pdf";
//First approach

  /*String firstName = request.getFirstName(); 
  String lastName = request.getLastName();
  String middleName = request.getMiddleName(); 
  String email = request.getEmail();
  String phone = request.getPhone();
  
  Passenger passenger = new Passenger(); 
  passenger.setFirstName(firstName);
  passenger.setLastName(lastName); 
  passenger.setMiddleName(middleName);
  passenger.setEmail(email); 
  passenger.setPhone(phone);*/
 
//Second Approach
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
	//	Optional<Flight> findById = Optional.empty();
		
		Flight flight = findById.orElse(null);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		Reservation saveReservation = reservationRepo.save(reservation);
		 filePath ="D:\\sts\\STS WorkSpace\\Flight\\TICKETS\\reservation"+saveReservation.getId()+".pdf";
		PDFgenerator.generateItinerary(reservation,filePath);
		
		//emailUtil.emailItinerary(passenger.getEmail(),filePath);
		return saveReservation;
	}

}