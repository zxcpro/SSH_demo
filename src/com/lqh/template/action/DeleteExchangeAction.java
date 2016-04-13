package com.lqh.template.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.Exchange;
import com.lqh.template.service.IExchangeService;

@Controller(value = "deleteExchangeAction")
@Scope("prototype")
public class DeleteExchangeAction extends AbstractBaseAction {

	private static final long serialVersionUID = 1L;
	private IExchangeService exchangeService;
	
	private int exchangeId;
	
	public String deleteExchange() throws Exception {
		exchangeService.delete(exchangeId);
		return "success";
	}
	
	public int getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(int exchangeId) {
		this.exchangeId = exchangeId;
	}

	public IExchangeService getExchangeService() {
		return exchangeService;
	}

	@Resource(name="exchangeService")
	public void setExchangeService(IExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
}
