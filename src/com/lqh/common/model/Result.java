package com.lqh.common.model;

import com.lqh.common.util.MsgPropertyUtil;

@SuppressWarnings("serial")
public class Result extends AbstractBaseModel{
	private int operationResult;
	
	private String msg;
	
	public Result() {
		super();
	}
	
	public Result(int operationResult, String msgKey) {
		super();
		this.operationResult = operationResult;
		this.msg = MsgPropertyUtil.get(msgKey);
	}

	public int getOperationResult() {
		return operationResult;
	}

	public void setOperationResult(int operationResult) {
		this.operationResult = operationResult;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setMsgKey(String msgKey) {
		this.msg = MsgPropertyUtil.get(msgKey);
	}
	
	
}
