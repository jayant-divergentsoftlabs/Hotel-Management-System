package com.divergent.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="roomtype")
@Getter
@Setter
@ToString
public class RoomType {
	@Id
	@Column(name = "roomtypeId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long roomtypeId;
	
	@Column
	@NotNull
	String roomType;
	
	@Column
	@NotNull
	String description;
	
	@Column
	@NotNull
	float cost;
	
	@Column
	@NotNull
	String status;

//	public long getRoomId() {
//		return roomtypeId;
//	}
//
//	public void setRoomId(long roomId) {
//		this.roomtypeId = roomId;
//	}
//
//	public String getRoomType() {
//		return roomType;
//	}
//
//	public void setRoomType(String roomType) {
//		this.roomType = roomType;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public float getCost() {
//		return cost;
//	}
//
//	public void setCost(float cost) {
//		this.cost = cost;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	@Override
//	public String toString() {
//		return "RoomType [roomId=" + roomtypeId + ", roomType=" + roomType + ", description=" + description + ", cost="
//				+ cost + ", status=" + status + "]";
//	}
	
	

}
