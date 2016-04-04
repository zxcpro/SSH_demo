package com.lqh.common.dao;

import java.util.List;

import com.lqh.common.model.Model;
import com.lqh.common.model.PageSupport;

public interface IBaseDao<M extends Model> {	
	
	public void add(M model) throws Exception;	
	
	public void addOrUpdate(M model) throws Exception;
	
	public void update(M model) throws Exception;	
	
	public void delete(Integer id) throws Exception;
	
	public void delete(M model) throws Exception;
	
	public M querySingle(Integer id);
	
	public List<M> queryAll();
	
	public int queryAllCount();
	
	public List<M> queryByPage(PageSupport pageInfo);
	
	public List<M> queryByHQL(String hql);
}
