package com.shivi.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.shivi.flightcheckin.integration.dto.Reservation;
import com.shivi.flightcheckin.integration.dto.ReservationUpdateRequest;


@Component
public class ReservationRestClientImpl implements ReservationRestClient{

	private static final String HTTP_LOCALHOST_8080_RESERVATIONS = "http://localhost:8080/flightreservation/reservations/";

	public Reservation findReservation(long id) {
	RestTemplate restTemplate= new RestTemplate();
	Reservation reservation=restTemplate.getForObject(HTTP_LOCALHOST_8080_RESERVATIONS+id, Reservation.class);
		return reservation;
	}

	public Reservation updateReservation(ReservationUpdateRequest request) {
		
		RestTemplate restTemplate= new RestTemplate();
		Reservation reservation=restTemplate.postForObject(HTTP_LOCALHOST_8080_RESERVATIONS,request, Reservation.class);
			return reservation;
	}

}
