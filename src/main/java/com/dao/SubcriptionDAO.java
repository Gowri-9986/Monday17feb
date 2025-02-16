package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Subscription;

@Repository
public interface SubcriptionDAO {
	public boolean addSubscription(Subscription subscription);

}
