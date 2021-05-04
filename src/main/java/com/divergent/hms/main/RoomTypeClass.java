package com.divergent.hms.main;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.hms.entity.RoomType;
import com.divergent.hms.service.RoomTypeService;

@Component
public class RoomTypeClass {
	private static final Logger myLogger = LoggerFactory.getLogger(RoomTypeClass.class);

	@Autowired
	RoomTypeService roomTypeService;

	public void roomtypeMenu() {
		System.out.println("\n-------------------- Menu--------------------");
		System.out.println("1. Add ");
		System.out.println("2. Search ");
		System.out.println("3. List ");
		System.out.println("4. Delete ");
		System.out.println("5. Exit");

		while (true) {

			Scanner sc = new Scanner(System.in);

			int input = sc.nextInt();

			switch (input) {
			case 1:
				add();
				break;

			case 2:
				search();
				break;

			case 3:
				list();
				break;

			case 4:
				delete();
				break;

			case 5:

				break;
			}
		}
	}

	private void add() {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Room Type : ");
		String roomType = sc.next();

		System.out.print("\nEnter Description : ");
		String description = sc.next();

		System.out.print("\nEnter Cost : ");
		float cost = sc.nextInt();

		System.out.print("\nEnter Status : ");
		String status = sc.next();

		roomTypeService.add(roomType, description, cost, status);
		System.out.println("\n Insert Succesfully");
	}

	private void list() {
		List<RoomType> list = this.roomTypeService.listAll();
		System.out.println("\n---------------------------------Doctor List--------------------------------------");
		for (RoomType type : list) {
			System.out.printf("| %5s | %10s | %20s | %10s |\n", type.getRoomtypeId(), type.getRoomType(),
					type.getDescription(), type.getCost(), type.getStatus());

		}
		System.out.println("--------------------------------------------------------------------------------------");
	}

	private void delete() {
		System.out.println("\nEnter room typr id :");
		Scanner sc = new Scanner(System.in);
		int roomtypeId = sc.nextInt();
		if (this.roomTypeService.remove(roomtypeId)) {
			myLogger.info("----Deleted----");
		} else {
			myLogger.error("Not Found");
		}
	}

	private void search() {
		System.out.print("\nEnter RoomType Id : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		RoomType type = roomTypeService.findById(id);

		if (type != null) {
			System.out.println("\n------------------------------------Doctor Data-----------------------------------");

			System.out.printf("| %5s | %10s | %20s | %10s |\n", type.getRoomtypeId(), type.getRoomType(),
					type.getDescription(), type.getCost(), type.getStatus());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nDoctor Data Not Found!");
		}
	}

}