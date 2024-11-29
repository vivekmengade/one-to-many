package com.ThrowAndThrows;

public class Num {
	
	public static void Invalid(int age) {
		if(age<21) {
			throw new CheckAGE("driving is not allowed you");
		}else {
			System.out.println("You Can Drive");
		}
	}
	public static void main(String[] args) {
		Invalid(15);
	}
	
}