package com.divergent.hms.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CustomerMenu {

	@Autowired
	private AddCustomer addCustomer;
	void customerPanel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n---- Customer Panel-----");
		System.out.println("1. Create Customer\n" + "2. List of Customer");
		System.out.println("Enter Your Choice: ");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			addCustomer.add();
			break;
		case 2:
			addCustomer.list();
			break;
		}
		
	}

}
