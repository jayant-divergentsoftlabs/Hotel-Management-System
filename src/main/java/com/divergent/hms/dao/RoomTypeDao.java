package com.divergent.hms.dao;

import java.util.List;

import com.divergent.hms.entity.RoomType;

public interface RoomTypeDao {

	public void add(RoomType roomType);

	public void remove(RoomType roomType);

	public RoomType findById(int roomtypeId);

	public List<RoomType> listAll();
}
