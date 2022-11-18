package org.tnsindia.service;

import org.tnsindia.dao.CustomerDao;
import org.tnsindia.entities.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao dao;

	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
