package com.xworkz.fire.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fire.entity.FireStationEntity;

@Repository
public class FireStationRepositoryImpl implements FireStationRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public FireStationRepositoryImpl() {
		System.out.println("Created "+ getClass().getSimpleName());
	}
	
	@Override
	public boolean save(FireStationEntity entity) {
		System.out.println("Running save in repositrory");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	@Override
	public FireStationEntity findById(int id) {
		System.out.println("find by id in repo "+ id);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FireStationEntity entity = entityManager.find(FireStationEntity.class, id);
		entityManager.close();
		return entity;
	}
	@Override
	public List<FireStationEntity> findByStationName(String stationName){
		System.out.println("Running findbyName in repository "+stationName);
		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
		Query query = manager.createNamedQuery("findByStationName");
		query.setParameter("stationName", stationName);
		System.out.println("query:" + query);
		List<FireStationEntity> list = query.getResultList();
		System.out.println("Total list found in repo"+ list.size());
		return list;
		
	  }finally {
		  manager.close();
		  System.out.println("Released the connection");
	  }
	}
	
	@Override
	public boolean update(FireStationEntity entity) {
		EntityManager manager = entityManagerFactory.createEntityManager();
	try {
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		return true;
		
	}finally {
		manager.close();
	}
	
	}
	
	@Override
	public FireStationEntity deleteById(int id) {
		EntityManager manager =entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			FireStationEntity entity = manager.find(FireStationEntity.class, id);
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			return entity;
		}finally {
			manager.close();
		}
	}
	

}
