package com.divergent.hms.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "'booking'")
@Getter
@Setter
@ToString
public class Booking {


	@Id
	@Column(name = "`bookingId`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;

	@OneToMany(targetEntity = Room.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "roomid", nullable = false)
	private Set<Room> room;

	@ManyToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerid", nullable = false)
	private Customer customer;

	@Column
	@NotNull
	private LocalDate bookingdate;

	@Column
	@NotNull
	private LocalDateTime checkin;

	@Column
	@NotNull
	private LocalDateTime checkout;

	@Column
	@NotNull
	private String status;

}
