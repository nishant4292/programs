package com.raystech.exception;

public class TestException4 {
	public static void main(String[] args) {
		try{int a= 20;
		int b=0;
		double c = a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
		System.out.println("b ki value low hai");
	}finally {
		System.out.println("finally");
	}

}
}