package com.lqh.template.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.Exchange;
import com.lqh.template.service.IExchangeService;

@Controller(value = "addExchangeAction")
@Scope("prototype")
public class AddExchangeAction extends AbstractBaseAction {

	private static final long serialVersionUID = 1L;
	private IExchangeService exchangeService;
	
	private String name;
	private String title;
	private String description;
	private String mobile;
	
	public String addExchange() throws Exception {
		System.out.print(name);
		Exchange model = new Exchange(title,name,mobile,description);
		exchangeService.add(model);
		return "success";
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	@Resource(name="exchangeService")
	public void setExchangeService(IExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
}
