package com.lqh.template.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lqh.common.dao.impl.AbstractBaseDaoImp;
import com.lqh.template.model.Exchange;

@Repository(value = "exchangeDao")
@Scope("prototype")
public class ExchangeDaoImpl extends AbstractBaseDaoImp<Exchange> implements IExchangeDao {

	public ExchangeDaoImpl() {
		super(Exchange.class);
	}

}
