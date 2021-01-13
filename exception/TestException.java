package com.raystech.exception;
public class TestException {
	
	 public static void main(String[] args) {
		 try { String s= "shivani";
		          System.out.println(s.charAt(8));
	 }catch(StringIndexOutOfBoundsException e) {
		 System.out.println("character kam hai");
	 }
	}

}
