package com.raystech.exception;

public class TestException5 {
	public static void main(String[] args) {
		try{String s = "nishantjain";
				System.out.println(s.charAt(12));
		try{String b = "nishant" ;
		System.out.println(b.charAt(8));
		}catch( Exception e) {
			System.out.print(e.getMessage());
				}finally {
			System.out.println("finally");
				}
				}finally {
			System.out.println("finally");
		}
			
		}
		}
	

	


