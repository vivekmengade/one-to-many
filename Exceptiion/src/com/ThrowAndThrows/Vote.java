package com.ThrowAndThrows;

public class Vote {

	public static void Invalid(int age) {
		if(age<18) {
			throw new AgeInvalid("Java Environment Not Found!!! ");
		}else {
			System.out.println("age is Valid");
		}
		
		
	}
	public static void main(String arg[]) {
		Invalid(10);
	}
	
	
}
