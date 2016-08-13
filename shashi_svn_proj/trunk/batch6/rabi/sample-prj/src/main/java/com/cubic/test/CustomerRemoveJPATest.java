package com.cubic.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cubic.entity.CustomerEntity;

public class CustomerRemoveJPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			emf = Persistence.createEntityManagerFactory("OracleUnit");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			CustomerEntity entity = em.find(CustomerEntity.class, new Long(1000));
			em.remove(entity);
			et.commit();
		}
		finally {
			if(em != null) em.close();
			if(emf != null) emf.close();
		}

	}

}
