package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;

@Repository
public class EggRepositoryImpl implements EggRepository {
	@Autowired
	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	public EggRepositoryImpl() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
		System.out.println("running save in repository");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		System.out.println("Data Has been saved");

		return false;
	}

}
