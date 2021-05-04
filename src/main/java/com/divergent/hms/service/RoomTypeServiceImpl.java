package com.divergent.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.divergent.hms.dao.RoomTypeDao;
import com.divergent.hms.entity.RoomType;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

	@Autowired
	private RoomTypeDao roomtypeDao;

	@Transactional
	@Override
	public void add(String roomType, String description, float cost, String status) {
		RoomType type = new RoomType();
		type.setRoomType(roomType);
		type.setDescription(description);
		type.setCost(cost);
		type.setStatus(status);
		roomtypeDao.add(type);
	}

	@Transactional
	@Override
	public boolean remove(int roomtypeId) {
		RoomType roomType = this.findById(roomtypeId);
		if (roomType != null) {
			this.roomtypeDao.remove(roomType);
			return true;
		}
		return false;
	}

	@Transactional

	@Override
	public RoomType findById(int roomtypeId) {
		return roomtypeDao.findById(roomtypeId);
	}

	@Transactional

	@Override
	public List<RoomType> listAll() {

		return this.roomtypeDao.listAll();
	}

}
