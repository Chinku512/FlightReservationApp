package com.example.Flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Flight.DTO.ReservationRequest;
import com.example.Flight.Entity.Reservation;
import com.example.Flight.Service.ReservationService;
import com.example.Flight.Utility.PDFgenerator;

@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request, ModelMap model) {
		//Reservation reservationId = reservationService.bookFlight(request);
		//model.addAttribute("reservationId", reservationId.getId());
		Reservation reservationId = reservationService.bookFlight(request);
		model.addAttribute("reservationId", reservationId.getId()); 
		return "confirmReservation";
		
	}
}
