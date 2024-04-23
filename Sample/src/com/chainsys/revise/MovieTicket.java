package com.chainsys.revise;

import java.util.Scanner;

public class MovieTicket {
	public static void main(String[] args) {

		String movieName;
		String pattern = "[A-Za-z]+";

		TicketE td = new TicketE();
		if (td.seatAvailability()) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n-----------------------------------------------\n");
			System.out.print("\nAvailable Movies  \n1.Jailer \n2.Leo \n3.Remo");
			System.out.print("\nEnter your MovieName  :");
			movieName = sc.next().toLowerCase();
			while (!movieName.matches(pattern)) {
				System.out.print("Enter your MovieName Again  :");
				movieName = sc.next().toLowerCase();
			}
			TicketB ta = new TicketB();

			if (movieName.equals("jailer")) {
				ta.ticketDetails();
			}

			if (movieName.equals("leo")) {
				ta.ticketDetails();
			}
			if (movieName.equals("remo")) {
				ta.ticketDetails();
			}

		}

	}
}