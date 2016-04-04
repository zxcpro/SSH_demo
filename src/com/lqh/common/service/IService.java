package com.lqh.common.service;

import java.util.List;

import com.lqh.common.model.Model;
import com.lqh.common.model.PageSupport;


public interface IService<M extends Model> {
	public void add(M model) throws Exception;
	
	public void addOrUpdate(M model) throws Exception;
	
	public void update(M model) throws Exception;
	
	public void delete(Integer id) throws Exception;
	
	public List<M> queryByPage(PageSupport pageInfo);
	
	public List<M> queryAll();
}
