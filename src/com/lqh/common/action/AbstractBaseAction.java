package com.lqh.common.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;


public abstract class AbstractBaseAction extends ActionSupport implements IBaseAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6749601005983092726L;

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private HttpServletRequest request;
	
	private Map<String, Object> session;
	
	private Map<String, Object> application;
	
	private HttpServletResponse response;
	
	public final void debug(String message) {
		if(logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}
	
	public final void error(String message) {
		if(logger.isErrorEnabled()) {
			logger.error(message);
		}
	}
	
	public final void setErrorTip(String key, String value) {
		request.setAttribute(key, value);
	}

	public HttpServletRequest getRequest() {
		return request;
	}
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getApplication() {
		return application;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpServletResponse getResponse() {
		return response;
	}
}
