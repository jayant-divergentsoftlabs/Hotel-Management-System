package com.divergent.hms.dao;

import java.util.List;

import com.divergent.hms.entity.Customer;

public interface CustomerDao {

	public void add(Customer customer);

	public List<Customer> get();

}
