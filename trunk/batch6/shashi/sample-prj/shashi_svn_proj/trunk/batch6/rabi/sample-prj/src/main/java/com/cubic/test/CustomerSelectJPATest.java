package com.cubic.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cubic.entity.CustomerEntity;

public class CustomerSelectJPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("OracleUnit");
			em = emf.createEntityManager();
			TypedQuery<CustomerEntity> query = 
					em.createQuery("select c from CustomerEntity c",CustomerEntity.class);
			List<CustomerEntity> results = query.getResultList();
			for(CustomerEntity entity:results) {
				System.out.println(entity);
			}
		}
		finally {
			if(em != null) em.close();
			if(emf != null) emf.close();
		}

	}

}
