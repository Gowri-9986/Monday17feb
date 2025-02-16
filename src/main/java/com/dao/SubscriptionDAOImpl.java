package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Subscription;

@Component
public class SubscriptionDAOImpl implements SubcriptionDAO{
	List<Subscription> subcriptionlist =new ArrayList<>();

	@Override
	public boolean addSubscription(Subscription subscription) {
		// TODO Auto-generated method stub
		try {
			subcriptionlist.add(subscription);
			return true;
			
			
		}
		catch(Exception e) {
		return false;
	}

}
}
