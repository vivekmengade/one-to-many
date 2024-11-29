package com.Handling;

public class Test {
public static void main(String[] args) {
	System.out.println("Start");
	int a=10;
	int b=0;
	int c=0;
	
		try {
			c=a/b;
		}catch(ArithmeticException a1){
			a1.printStackTrace();
//			b=5;
//			c=a/b;
		}
	System.out.println(c);
	System.out.println("Stop");
	System.out.println("Stop"); 
}
}
