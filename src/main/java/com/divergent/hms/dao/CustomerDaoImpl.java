package com.divergent.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.hms.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Customer customer) {
		em.persist(customer);
	}

	@Override
	public List<Customer> get() {
		CriteriaQuery<Customer> criteriaQuery = em.getCriteriaBuilder().createQuery(Customer.class);
		@SuppressWarnings("unused")
		Root<Customer> root = criteriaQuery.from(Customer.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}
