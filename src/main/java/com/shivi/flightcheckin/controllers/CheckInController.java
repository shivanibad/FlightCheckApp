package com.shivi.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shivi.flightcheckin.integration.ReservationRestClient;
import com.shivi.flightcheckin.integration.dto.Reservation;
import com.shivi.flightcheckin.integration.dto.ReservationUpdateRequest;


@Controller
public class CheckInController {


@Autowired
ReservationRestClient restClient;
	
	@RequestMapping(value="/showStartCheckin")
	public String showCheckIn() {
		return "startCheckin";
		
	}
	
	@RequestMapping(value="/startCheckin")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelmap) {
		Reservation	reservation=restClient.findReservation(reservationId);
		modelmap.addAttribute("reservation",reservation);
		return "displayReservationDetails";
		
		
	}
	
	/*
	 * @GetMapping(value="/startCheckinn/{reservationId}") public
	 * ResponseEntity<String> startCheckInn(@PathVariable("reservationId") int
	 * reservationId) { //Reservation
	 * reservation=restClient.findReservation(reservationId);
	 * //modelmap.addAttribute("reservation",reservation); //return
	 * "displayReservationDetails"; return new ResponseEntity<String>("working",
	 * HttpStatus.OK);
	 * 
	 * }
	 */
	
	
	@RequestMapping(value="/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,@RequestParam("numberOfBags")int numberOfBags) {
				ReservationUpdateRequest reservationUpdateRequest= new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateRequest);
		return "checkInConfirmation";
		
	}
	
}
