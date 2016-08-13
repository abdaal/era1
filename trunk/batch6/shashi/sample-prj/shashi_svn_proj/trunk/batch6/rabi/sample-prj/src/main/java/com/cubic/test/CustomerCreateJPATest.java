package com.cubic.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cubic.entity.CustomerEntity;

public class CustomerCreateJPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			emf = Persistence.createEntityManagerFactory("OracleUnit");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			CustomerEntity entity = new CustomerEntity("Smith","Johnson","222-11-3333");
			em.persist(entity);
			System.out.println(entity);
			et.commit();
		}
		finally {
			if(em != null) em.close();
			if(emf != null) emf.close();
		}

	}

}
