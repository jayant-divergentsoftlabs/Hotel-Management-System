package com.divergent.hms.service;

import java.util.List;

import com.divergent.hms.entity.Customer;

public interface CustomerService {

	public void add(String customerName, String address, String contactno, String gender, String idproof,
			String status);

	public List<Customer> getList();

	
}
