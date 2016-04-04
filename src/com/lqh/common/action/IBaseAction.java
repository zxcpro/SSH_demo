package com.lqh.common.action;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

public interface IBaseAction extends ServletRequestAware, SessionAware, ApplicationAware, ServletResponseAware{

}
