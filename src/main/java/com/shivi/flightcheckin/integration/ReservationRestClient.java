package com.shivi.flightcheckin.integration;

import com.shivi.flightcheckin.integration.dto.Reservation;
import com.shivi.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(long id) ;
	public Reservation updateReservation(ReservationUpdateRequest request) ;
	
}
