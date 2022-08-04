package com.globallogic.day5;

class Singer{
	
	public void sings() {
		System.out.println("Sings song");
	}
}

class ClassicalSinger extends Singer{
	
	public void sings() {
		super.sings();
		System.out.println("Sings Classical song");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassicalSinger cs  = new ClassicalSinger();
		cs.sings();
		
		Singer s = new ClassicalSinger();
		s.sings();

	}

}
