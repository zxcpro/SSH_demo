package com.lqh.common.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lqh.common.dao.IBaseDao;
import com.lqh.common.model.Model;
import com.lqh.common.model.PageSupport;

public abstract class AbstractBaseDaoImp<M extends Model> extends HibernateDaoSupport
										      implements IBaseDao<M>{

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected final Class<M> clazz;
	protected final String clazzName;
	
	protected AbstractBaseDaoImp(Class<M> clazz) {
		this.clazz = clazz;
		clazzName = clazz.getSimpleName();
	}

	public final void add(M model) throws Exception{
		this.getHibernateTemplate().save(model);		
	}
	
	public void addOrUpdate(M model) throws Exception {
		this.getHibernateTemplate().saveOrUpdate(model);
	}
	
	public final void delete(Integer id) throws Exception {
		StringBuffer hql = new StringBuffer();
		hql.append("delete ");
		hql.append(clazzName);
		hql.append(" o where o.id = ");
		hql.append(id);
		
		debug("delete method hql: " + hql);
		Session session = this.getSession();
		Query query = session.createQuery(hql.toString());
		query.executeUpdate();
		releaseSession(session);
	}
	
	public void delete(M model) throws Exception {
		this.getHibernateTemplate().delete(model);
	}
	
	public final void update(M model) throws Exception {
		this.getHibernateTemplate().update(model);
	}

	@SuppressWarnings("unchecked")
	public final List<M> queryAll() {
		debug("entering queryAll method..");
		try {
			List<M> list = this.getHibernateTemplate().find("from " + clazzName);			
			debug("finshed queryAll method successfully");		
			return list;
		} catch (DataAccessException e) {
			e.printStackTrace();
			info("sorry, queryAll method failure, please try again!");
		}		
		return null;
	}

	@SuppressWarnings("unchecked")
	public final int queryAllCount() {
		final StringBuffer hql = new StringBuffer();
		hql.append("select count(o) from ");
		hql.append(this.clazzName);
		hql.append(" o");
		
		debug("entering queryAllCount method hql: " + hql);
		try {
			List<Object> list = this.getHibernateTemplate().find(hql.toString());
			int result = ((Long)list.get(0)).intValue();
			debug("finshed queryAllCount method successfully! result : " + result);
			return result;
		} catch (DataAccessResourceFailureException e) {
			e.printStackTrace();
			info("sorry, queryAllCount method failure, please try again!");
		} catch (HibernateException e) {
			e.printStackTrace();
			info("sorry, queryAllCount method failure, please try again!");
		} catch (IllegalStateException e) {
			e.printStackTrace();
			info("sorry, queryAllCount method failure, please try again!");
		}
		 return -1;
	}

	@SuppressWarnings("unchecked")
	public final int queryByConditionCount(String hqlStr) {
		
		StringBuffer hql = new StringBuffer();
		hql.append("select count(o) ");
		hql.append(hqlStr);
		debug("entering queryByConditionCount method hql:" + hql);
		Session session = null;
		try {
			session = this.getSession();
			Query query = session.createQuery(hql.toString());
			List<Object> list = query.list();
			int result = ((Long)list.get(0)).intValue();
			debug("finshed queryAllCount method successfully! result : " + result);
			return result;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} finally {
			if(session != null) {
				releaseSession(session);
			}
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	protected List<M> prepareResult(List<?> list) {
		return (List<M>) list;
	}
	
	@SuppressWarnings("unchecked")
	public final List<M> queryByPage(PageSupport pageInfo) {
		final StringBuffer hql = new StringBuffer();		
		hql.append("from ");
		hql.append(clazzName);
		hql.append(" o");
		hql.append(" order by o.id desc");
		
		debug("entering queryByPage method hql: " + hql);
		
		Session session = null;
		try {			
			
			if(pageInfo == null) {
				pageInfo = new PageSupport();
			}
			
			pageInfo.setTotalCounts(queryAllCount());
			if(pageInfo.getCurrentPage() > pageInfo.getTotalPages()) {
				pageInfo.setCurrentPage(pageInfo.getTotalPages());
			}
			
			session = this.getSession();
			Query query = session.createQuery(hql.toString());
			query.setFirstResult(pageInfo.getStartPosition());
			query.setMaxResults(pageInfo.getPageSize());
			List<M> list = query.list();
			debug("finshed queryByPage method successfully!");
			return prepareResult(list);
		} catch (DataAccessResourceFailureException e) {
			e.printStackTrace();
			info("sorry, queryByPage method failure, please try again!");
		} catch (HibernateException e) {
			e.printStackTrace();
			info("sorry, queryByPage method failure, please try again!");
		} catch (IllegalStateException e) {
			e.printStackTrace();
			info("sorry, queryByPage method failure, please try again!");
		} finally {
			if(session != null) {
				releaseSession(session);
			}
		}
		
		return null;
	}

	public final M querySingle(Integer id) {
		debug("entering querySingle method id: " + id);	
		try {
			M model = this.getHibernateTemplate().get(clazz, id);			
			debug("finshed querySingle method successfully");		
			return model;
		} catch (DataAccessException e) {
			e.printStackTrace();
			info("sorry, querySingle id: " + id + "failure, please try again!");
		}		
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<M> queryByHQL(String hql) {
		return this.getHibernateTemplate().find(hql);
	}
	
	
	@Resource(name="sessionFactory")
	public void setSF(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
		
	public final void debug(String message) {
		if(logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}
	
	public final void info(String message) {
		if(logger.isInfoEnabled()) {
			logger.debug(message);
		}
	}

	
}
