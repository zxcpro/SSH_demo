package com.lqh.template.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.Exchange;
import com.lqh.template.service.IExchangeService;

@Controller(value = "exchangeListAction")
@Scope("prototype")
public class ExchangeListAction extends AbstractBaseAction {

	private static final long serialVersionUID = 1L;
	private IExchangeService exchangeService;
	
	private List<Exchange> results;

	
	public String exchangeList() {
		results = exchangeService.queryAll();
		return "exchangeList";
	}

	public List<Exchange> getResults() {
		return results;
	}

	public void setResults(List<Exchange> results) {
		this.results = results;
	}
	
	@Resource(name="exchangeService")
	public void setExchangeService(IExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
}
