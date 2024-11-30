package com.ThrowAndThrows;

public class InvalidPIN extends RuntimeException {
	
	public InvalidPIN(String msg) {
		super(msg);
	}

}
