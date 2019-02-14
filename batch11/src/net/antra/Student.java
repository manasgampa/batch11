package net.antra;

public class Student implements I1,I2{

	private int rollNo;
	static int marks;
	
	public void m1() {
		System.out.println("in instance method of Student m1"+rollNo);
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	
}
