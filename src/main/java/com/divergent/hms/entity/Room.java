package com.divergent.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="room")
@Getter
@Setter
@ToString
public class Room {
	@Id
	@Column(name = "roomId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long roomId;
	
	@ManyToOne(targetEntity = RoomType.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "room_type_id")
	@NotNull
	private RoomType roomtype;
	
	
	@NotNull
	String roomnumber;
	
	@NotNull
	String description;
	
	@NotNull
	String status;
//
//	public long getRoomId() {
//		return roomId;
//	}
//
//	public void setRoomId(long roomId) {
//		this.roomId = roomId;
//	}
//
//	public long getRoomtypeId() {
//		return roomtypeId;
//	}
//
//	public void setRoomtypeId(long roomtypeId) {
//		this.roomtypeId = roomtypeId;
//	}
//
//	public String getRoomnumber() {
//		return roomnumber;
//	}
//
//	public void setRoomnumber(String roomnumber) {
//		this.roomnumber = roomnumber;
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
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}

//	@Override
//	public String toString() {
//		return "Room [roomId=" + roomId + ", roomtypeId=" + roomtypeId + ", roomnumber=" + roomnumber + ", description="
//				+ description + ", status=" + status + "]";
//	}
	
}
