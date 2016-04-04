package com.lqh.common.service;

import java.util.List;

import com.lqh.common.dao.IBaseDao;
import com.lqh.common.model.Model;
import com.lqh.common.model.PageSupport;

public abstract class AbstractBaseService<M extends Model> implements IService<M> {
	
	protected abstract IBaseDao<M> getDefaultDao();

	public void add(M model) throws Exception {
		getDefaultDao().add(model);
	}

	public void addOrUpdate(M model) throws Exception {
		getDefaultDao().addOrUpdate(model);
	}

	public void delete(Integer id) throws Exception {
		getDefaultDao().delete(id);
	}

	public void update(M model) throws Exception {
		getDefaultDao().update(model);
	}
	
	public List<M> queryByPage(PageSupport pageInfo) {
		return getDefaultDao().queryByPage(pageInfo);
	}

	public List<M> queryAll() {
		return getDefaultDao().queryAll();
	}
}
