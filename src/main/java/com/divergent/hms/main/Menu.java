package com.divergent.hms.main;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.hms.service.RoomTypeService;

@Component
public class Menu {
	private static Logger logger = LoggerFactory.getLogger(Menu.class);

	@Autowired
	private CustomerMenu customerMenu;
	@Autowired
	private RoomTypeClass roomTypeClass;

	public void startPanel() {
		Scanner sc = new Scanner(System.in);
		logger.info("\n---- Panel-----");
		System.out.println(" 1. Customer\n" + "2.Room Type");
		System.out.println("Enter Your Choice: ");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			customerMenu.customerPanel();
			break;
		case 2:
			roomTypeClass.roomtypeMenu();
			break;
		}
	}
}