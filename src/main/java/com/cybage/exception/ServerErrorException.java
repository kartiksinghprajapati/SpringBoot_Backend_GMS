package com.cybage.exception;

public class ServerErrorException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public ServerErrorException(String message) {
		super(message);
	}
}
