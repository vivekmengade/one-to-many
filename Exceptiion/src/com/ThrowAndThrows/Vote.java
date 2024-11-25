package com.ThrowAndThrows;

public class Vote {

	public static void Invalid(int age) {
		if(age<18) {
			throw new AgeInvalid("Age is Invalid");
		}else {
			System.out.println("age is Valid");
		}
		
		
	}
	public static void main(String arg[]) {
		Invalid(100);
	}
	
	
}
