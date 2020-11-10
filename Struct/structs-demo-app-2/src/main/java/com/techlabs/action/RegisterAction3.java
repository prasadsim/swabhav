package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.RegisterVM;

public class RegisterAction3 extends ActionSupport {

	private RegisterVM register;

	public RegisterVM getModel() {
		register = new RegisterVM();
		return register;
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

	public RegisterVM getRegister() {
		return register;
	}

	public void setRegister(RegisterVM register) {
		this.register = register;
	}

}
