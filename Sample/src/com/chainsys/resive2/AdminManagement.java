package com.chainsys.resive2;

import java.util.Scanner;

public class AdminManagement {

	public void adminManagement() {

		LoginPassword lg = new LoginPassword();
		lg.login();
		
		
		Enquiry eq = new Enquiry();
		eq.availability();

	}
}
