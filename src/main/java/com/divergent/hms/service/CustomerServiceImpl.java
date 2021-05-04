package com.divergent.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergent.hms.dao.CustomerDao;
import com.divergent.hms.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional
	@Override
	public void add(String customerName, String address, String contactno, String gender, String idproof,
			String status) {
		Customer customer = new Customer();

//		customer.se
		
		customer.setCustomerName(customerName);
		customer.setAddress(address);
		customer.setContactno(contactno);
		customer.setGender(gender);
		customer.setIdproof(idproof);
		customer.setStatus(status);
		customerDao.add(customer);

	}

	@Override
	@Transactional
	public List<Customer> getList() {
		return customerDao.get();

	}

}
