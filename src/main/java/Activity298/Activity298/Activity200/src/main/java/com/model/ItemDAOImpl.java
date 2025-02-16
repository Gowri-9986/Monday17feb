package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ItemDAOImpl {
	EntityManager entityManager;
	public ItemDAOImpl() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("UserPU");
		entityManager=factory.createEntityManager();
	}
	
	public boolean addAddress(Item item) {
		try {
			EntityTransaction transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(item);
			transaction.commit();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean addItem() {
		// TODO Auto-generated method stub
		return false;
	}
	
 


}
