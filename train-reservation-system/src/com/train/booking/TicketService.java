package com.train.booking;
import java.util.List;
import java.util.LinkedList;

public class TicketService {
	private static List<Ticket> allTickets = new LinkedList<>();
	
	
	public static void addNewTicket(int trainNumber, List<Passenger> passengerList) {
		int pnr = allTickets.size()+1;
		Train bookedTrain = TrainService.findTrain(trainNumber);
		allTickets.add(new Ticket(pnr, bookedTrain, passengerList));
		System.out.println("Tickets booked successfully");
	}
	public static void showTicketDetails(int pnr) {
		Ticket tempTicket = null;
		for(Ticket t : allTickets) {
			if(t.getPnr()==pnr) {
				tempTicket = t;
				break;
			}
		}
		Train tempTrain = tempTicket.getBookedTrain();
		List<Passenger> passengerList = tempTicket.getPassengerList();
		int totalFare = tempTrain.getFare() * passengerList.size();
		System.out.println("Your booking details");
		System.out.println("PNR=>" + tempTicket.getPnr() +" Tr.No" + tempTrain.getTrainNumber());
		System.out.println("Train Name :" +tempTrain.getTrainName());
		System.out.println("From station :"+tempTrain.getFromStation() +" To Station :" + tempTrain.getToStation());
		System.out.println("DOJ:" + tempTrain.getDoj() + "Fare :"+ tempTrain.getFare() + "Total Fare:" + totalFare);
		System.out.println("\n$$passenger details$$\n");
		System.out.println("Passenger name and Age");
		for(Passenger p : passengerList) {
			System.out.println(p.getPassengerName()+"\t"+p.getAge());
		}
	}
	}

