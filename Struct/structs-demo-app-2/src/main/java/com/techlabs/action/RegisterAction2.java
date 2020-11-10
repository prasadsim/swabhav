package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.RegisterVM;

public class RegisterAction2 extends ActionSupport implements ModelDriven<RegisterVM> {

	private RegisterVM register;

	@Override
	public RegisterVM getModel() {
		register = new RegisterVM();
		return register;
	}

	public void validate() {
		if ("".equals(register.getName())) {
			addFieldError("name", "Enter Name");
		}
		if (register.getAge() == 0) {
			addFieldError("age", "Enter age");
		}
		if ("".equals(register.getEmail())) {
			addFieldError("email", "Enter email");
		}
	}

	public String execute() {
		return SUCCESS;
	}

	public String registerDo() {
		String msg = "Registration Complete!\nYour Details as follows:-\n";
		msg = msg + "Name:" + register.getName() + "\n";
		msg = msg + "Age:" + register.getAge() + "\n";
		msg = msg + "EmailId:" + register.getEmail() + "\n";
		register.setMsg(msg);
		return SUCCESS;
	}

}
