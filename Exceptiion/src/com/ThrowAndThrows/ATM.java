package com.ThrowAndThrows;

public class ATM {

	static double balance = 3000;
	static int pin = 3167;
	public static void CheckBalance(int pin1) {
		if(pin1!=pin) {
			throw new InvalidPIN("Incorrect Pin");
		}else {
			System.out.println(balance);
		}
	}
	public static void main(String[] args) {
		CheckBalance(3167);
	}
	
}
