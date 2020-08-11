package com.shivi.flightcheckin.integration.dto;

import java.sql.Timestamp;
import java.util.Date;




public class Reservation {

	private Long id;
	private boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	
	

	public Reservation(Long id, boolean checkedIn, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.id = id;
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", passenger="
				+ passenger + ", flight=" + flight + "]";
	}
	
	
	

	
}
