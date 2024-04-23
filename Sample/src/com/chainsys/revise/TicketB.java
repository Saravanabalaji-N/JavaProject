package com.chainsys.revise;

import java.util.Scanner;

public class TicketB {

	Scanner sc = new Scanner(System.in);
	public void ticketDetails() {
		
		String count;
		int price;
		String pattern4="[0-9]";
		System.out.print("Enter Total no of person  :");
		count = sc.next();
		while (!count.matches(pattern4)) {
			System.out.print("Enter Total no of person Again  :");
			count = sc.next();
      
	}
		price=100*Integer.parseInt(count);
		System.out.println("Total Price :"+price);
	}
}
