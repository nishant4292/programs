package com.raystech.exception;

public class TestException6 {
	public static void main(String[] args) {
		try{String s = "school";
		System.out.println(s.charAt(7));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("char low");
		}
		try{String c="nishant";
		System.out.println(c.charAt(8));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("ok");
		}
		
		}
	}


