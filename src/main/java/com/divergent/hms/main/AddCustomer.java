package com.divergent.hms.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.hms.entity.Customer;
import com.divergent.hms.service.CustomerService;

@Component
public class AddCustomer {

	@Autowired
	CustomerService customerService;

	public void add() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------Create Customer--------------------");

		System.out.print("\nEnter customer name : ");
		String customerName = sc.nextLine();

		System.out.print("\nEnter Address : ");
		String address = sc.nextLine();

		System.out.print("\nEnter Contact Number : ");
		String contactno = sc.next();

		System.out.print("\nEnter Gender : ");
		String gender = sc.next();

		System.out.print("\nEnter idproof Number : ");
		String idproof = sc.next();

		System.out.print("\nEnter status : ");
		String status = sc.next();

		customerService.add(customerName, address, contactno, gender, idproof, status);

	}

	public void list() {
		List<Customer> list1 = this.customerService.getList();
		System.out.println("\n--------------------------------- List--------------------------------------");
		for (Customer customer : list1) {
			System.out.printf("| %5s | %5s | %5s | %5s| %5s| %5s |\n", customer.getCustomerId(), customer.getCustomerName(),
					customer.getAddress(), customer.getContactno(), customer.getGender(), customer.getIdproof(),
					customer.getStatus());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
