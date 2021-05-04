package com.divergent.hms.service;

import java.util.List;

import com.divergent.hms.entity.RoomType;

public interface RoomTypeService {
	void add(String roomType, String description, float cost, String status);
	boolean remove(int roomtypeId);
	RoomType findById(int roomtypeId);
	List<RoomType> listAll();

}
