package com.raystech.exception;

public class TestException3 {
	public static void main(String[] args) {
		String s="nishant";
		try{int a[] = {1,2,3,4,5,6};
				System.out.println(a[6]);
				System.out.println(s.charAt(8));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no.kam hai");
		}
				
	}

}
