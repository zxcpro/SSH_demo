package com.lqh.template.exception;

public class PasswordNotCorrectException extends RuntimeException {

	private static final long serialVersionUID = -6579348619887009385L;

	public PasswordNotCorrectException() {
		super();
	}

	public PasswordNotCorrectException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordNotCorrectException(String message) {
		super(message);
	}

	public PasswordNotCorrectException(Throwable cause) {
		super(cause);
	}

	
}
