package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer;

	public String execute() throws Exception {
		return SUCCESS;
	}

	public Customer getModel() {
		customer = new Customer();
		return customer;
	}

	public void setModel(Customer customer) {
		this.customer = customer;
	}
}