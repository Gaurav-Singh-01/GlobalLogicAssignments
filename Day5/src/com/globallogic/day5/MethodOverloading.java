package com.globallogic.day5;

public class MethodOverloading {
	
	public int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		
		MethodOverloading mo = new MethodOverloading();
		
		int sum1 = mo.sum(4, 5);
		System.out.println(sum1);
		
		int sum2 = mo.sum(4, 5, 6);
		System.out.println(sum2);
		
		float sum3 = mo.sum(4.3f, 5.4f);
		System.out.println(sum3);
	}

}
