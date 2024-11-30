package com.Handling;

public class Test2 {
	
	public static void Division() throws Exception{
		
		int a=10;
		int b=0;
		int c=0;
		try {
			c=a/b;
		}catch(ArithmeticException a1) {
			a1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Division();
	}
	
}
