package com.techlab.interceptor;

import org.apache.struts2.dispatcher.SessionMap;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class UserInterceptor implements Interceptor {
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		SessionMap<String, Object> session = (SessionMap<String, Object>) invocation.getInvocationContext()
				.getSession();
		ValueStack stack = invocation.getStack();
		String id = stack.findString("id");
		if (id != null) {
			User user = userService.getUserById(Integer.parseInt(id));
			if (user != null)
				session.put("user", user);
			Task task = taskService.getTask((Integer.parseInt(id)));
			if (task != null)
				session.put("task", task);
		}
		return invocation.invoke();
	}

}
