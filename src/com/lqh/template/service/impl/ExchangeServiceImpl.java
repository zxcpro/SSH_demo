package com.lqh.template.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lqh.common.dao.IBaseDao;
import com.lqh.common.service.AbstractBaseService;
import com.lqh.template.dao.IExchangeDao;
import com.lqh.template.dao.IUserDao;
import com.lqh.template.exception.PasswordNotCorrectException;
import com.lqh.template.exception.UserNotExistException;
import com.lqh.template.model.Exchange;
import com.lqh.template.model.User;
import com.lqh.template.service.IExchangeService;
import com.lqh.template.service.IUserService;

@Service(value = "exchangeService")
@Scope("prototype")
public class ExchangeServiceImpl extends AbstractBaseService<Exchange> implements IExchangeService{

	private IExchangeDao exchangeDao;
	
	@Override
	protected IBaseDao<Exchange> getDefaultDao() {
		return exchangeDao;
	}

	public IExchangeDao getExchangeDao() {
		return exchangeDao;
	}
	
	@Resource(name="exchangeDao")
	public void setExchangeDao(IExchangeDao exchangeDao) {
		this.exchangeDao = exchangeDao;
	}

}
