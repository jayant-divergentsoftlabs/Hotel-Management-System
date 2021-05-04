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
@Table(name="customer")
@Getter
@Setter
@ToString
public class Customer {
	@Id
	@Column(name = "customerId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerId;
	
	@Column
	@NotNull
	private String customerName;
	@Column
	@NotNull
	private String address;
	@Column
	@NotNull
	private String contactno;
	@Column
	@NotNull
	private String gender;
	@Column
	@NotNull
	private String idproof;
	
	@Column
	@NotNull
	private String status;
	
}
