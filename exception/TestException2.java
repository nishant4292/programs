package com.raystech.exception;

public class TestException2 {
	public static void main(String[] args) {
		try{String s="nishant";
		System.out.println(s.length());
		
		System.out.println(s.charAt(9));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("char kam hai");
		}
		
		
		
		
	}

}
