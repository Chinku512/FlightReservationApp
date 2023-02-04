package com.example.Flight.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Flight.Entity.Flight;
import com.example.Flight.Repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired 
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
    public String findFLights(@RequestParam("source")String source,
    						  @RequestParam("destination")String destination,
                              @RequestParam("departDate")@DateTimeFormat(pattern ="MM-dd-yyyy") Date departDate,
                             ModelMap modelMap) {
		List<Flight> findFlights =flightRepo.findFlights(source,destination,departDate);
		modelMap.addAttribute("findFlights", findFlights);
			return "displayFlight";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId,ModelMap modelmap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelmap.addAttribute("flight", flight);
		
		return "showReservation";
		
	}
}
