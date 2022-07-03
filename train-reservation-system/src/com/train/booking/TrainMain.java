package com.train.booking;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class TrainMain {
public static void main(String[] args) {
	System.out.println("Searching for the trains??");
	TrainService.searchTrainsBetweenStations("Hyderabad","Bangalore", LocalDate.now(), 10);
	BankAccount b1 = new BankAccount();
	b1.setActNumber(999);
	b1.setActBalance(10000);
	Passenger p1 = new Passenger(10, "Sai",20,b1);
	Passenger p2 = new Passenger(20, "Tharun",21,b1);
	Passenger p3 = new Passenger(20, "Seenu",21,b1);
	Passenger p4 = new Passenger(30, "john",35,b1);
	int initialBalance = b1.getActBalance();
	
	List<Passenger> passengerList = new LinkedList<>();
	
	passengerList.add(p1);
	passengerList.add(p2);
	passengerList.add(p3);
	passengerList.add(p4);
	System.out.println("The tickets are booking for the passengers!!");
	
	
	
	TrainService.bookTickets(101, passengerList);
	System.out.println("**Ticketdetails**");
	TicketService.showTicketDetails(1);
	TrainService.searchTrainsBetweenStations("Hyderabad","Bangalore", LocalDate.now(), 10);
	int balanceAfterBookingTickets = b1.getActBalance();
	System.out.println("Initial balance = " + initialBalance);
	System.out.println("Balance after booking =  "+ balanceAfterBookingTickets);
}
}
