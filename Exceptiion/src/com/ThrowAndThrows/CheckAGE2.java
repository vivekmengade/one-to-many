package com.ThrowAndThrows;

public class CheckAGE2 {

	public static void Check(int age) {
		if(age<18) {
			throw new AgeInvalid2("You are not able to vote");
			
		}else {
			System.out.println("You are able to Vote");
		}
	}
	public static void main(String[] args) {
		Check(10);
	}
}
