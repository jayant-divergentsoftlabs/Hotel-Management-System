package com.divergent.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.hms.entity.RoomType;

@Repository
public class RoomTypeDaoImpl implements RoomTypeDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(RoomType roomType) {
		em.persist(roomType);
	}

	@Override
	public List<RoomType> listAll() {
		CriteriaQuery<RoomType> criteriaQuery = em.getCriteriaBuilder().createQuery(RoomType.class);
		@SuppressWarnings("unused")
		Root<RoomType> root = criteriaQuery.from(RoomType.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public void remove(RoomType roomType) {
		em.remove(roomType);
	}

	@Override
	public RoomType findById(int roomtypeId) {
		return em.find(RoomType.class, roomtypeId);
	}

	

}
