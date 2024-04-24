package com.chainsys.resive2;

import java.util.Scanner;

public class LoginPassword {

	public void login() {
		String userName;
		String password;
		String pattern = "Saravana";
		String pattern2 = "Saravana@11";
	    boolean s=false;
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("   -----LOGIN-----\n");
		System.out.println("enter your UserName :");
		userName = sc.next();
		while (!userName.matches(pattern)) {
			System.out.println("Incorrect UserName:");
			System.out.println("enter your UserName again:");
			userName = sc.next();
			s=true;
		}
		
		System.out.println("enter your Password :");
		password = sc.next();
		while (!password.matches(pattern2)) {
			System.out.println("Incorrect UserName:");
			System.out.println("enter your Password again:");
			password = sc.next();
			s=true;

	}
	}
	
	public void attendence() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("\n   -----Computer Science Students Details-----\n");
		System.out.println("1.Saravana\n2.Naveen\n3.Akash");
		System.out.println("\nenter your Name :");
		name = sc.next().toLowerCase();
		while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
			System.out.println("Incorrect Name:");
			System.out.println("\nenter your Name again :");
			name = sc.next().toLowerCase();
		}
		if(name.equals("saravana")) {
			System.out.println("\nName     : Saravana\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 95%");
		}
		if(name.equals("naveen")) {
			System.out.println("\nName     : Naveen\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 92%");
		}
		if(name.equals("akash")) {
			System.out.println("\nName     : Akash\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 98%");
		}
	}
	public void marks() {
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("\n   -----Computer Science Students Details-----\n");
		System.out.println("1.Saravana\n2.Naveen\n3.Akash");
		System.out.println("\nenter your Name :");
		name = sc.next().toLowerCase();
		while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
			System.out.println("Incorrect Name:");
			System.out.println("\nenter your Name again :");
			name = sc.next().toLowerCase();
		}
		if(name.equals("saravana")) {
			System.out.println("\nName     : Saravana\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 495/500");
		}
		if(name.equals("naveen")) {
			System.out.println("\nName     : Naveen\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 492/500");
		}
		if(name.equals("akash")) {
			System.out.println("\nName     : Akash\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 455/500");
		}
	
	}
	}
