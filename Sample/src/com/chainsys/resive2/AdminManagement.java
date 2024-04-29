package com.chainsys.resive2;

import java.util.Scanner;


interface Documents{
	
	public void adminManagement();
	
}

public class AdminManagement implements Documents {
	

	public void adminManagement() {

		LoginPassword lg = new LoginPassword();
		lg.login();
		
		
		Enquiry eq = new Enquiry();
		eq.availability();

	}
	
	
}
