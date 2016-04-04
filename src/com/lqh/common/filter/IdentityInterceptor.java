package com.lqh.common.filter;

import com.lqh.template.model.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

@SuppressWarnings("serial")
public class IdentityInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		User user = (User) invocation.getInvocationContext().getSession().get("currentUser");

System.out.println(user);

		if(user != null) {
			return invocation.invoke();
		} else {
			return "login";
		}
	}
   
	
}
