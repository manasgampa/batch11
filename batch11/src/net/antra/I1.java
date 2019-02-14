package net.antra;

public interface I1 extends I2{//pure abstract class
	
	int i=30;
	public void m1();
	
	public default void m2() {
		System.out.println("in method of m2 in I1 interface");
	}
	
	public static void m3() {
		
		System.out.println("in method m3 in I1 interface");
	}

}
