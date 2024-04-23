package com.chainsys.revise;

import java.util.Scanner;


interface TicketD {
	public boolean seatAvailability();
}

class TicketE implements TicketD {

	public boolean seatAvailability() {

		String Location;
		String pattern = "[A-Za-z]+";
		boolean s = false;

		Scanner sc = new Scanner(System.in);
		System.out.print("Available Area  \n1.Chennai \n2.Madurai \n3.Selam");
		;
		System.out.print("\nEnter your Area  :");
		Location = sc.next().toLowerCase();
		while (!Location.matches(pattern)) {
			System.out.print("Enter your Area Again  :");
			Location = sc.next().toLowerCase();

		}
		while (!Location.equals("chennai") && !Location.equals("madurai") && !Location.equals("selam")) {
			System.out.print("Enter your Area Again  :");
			Location = sc.next().toLowerCase();
		}
		if (Location.equals("chennai")) 
		{
			System.out.print("\n-----------------------------------------------\n");
			System.out.print("Theater Available");
			s =  true;
		}
		if (Location.equals("madurai"))

		{
			System.out.print("\n-----------------------------------------------\n");
			System.out.print("Theater Not Available");
			System.out.print("\n-----------------------------------------------\n");
		}
		if (Location.equals("selam")) {
			System.out.print("\n-----------------------------------------------\n");
			System.out.print("Theater Available");
			s=true;
		}
		
		return s;
	}

}