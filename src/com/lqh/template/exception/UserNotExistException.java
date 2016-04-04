package com.lqh.template.exception;

public class UserNotExistException extends RuntimeException{

	private static final long serialVersionUID = -8047109370788426124L;

	public UserNotExistException() {
		super();
	}

	public UserNotExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotExistException(String message) {
		super(message);
	}

	public UserNotExistException(Throwable cause) {
		super(cause);
	}
	
	

}
