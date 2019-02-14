package net.antra;

public interface I2 {

	public void m1();
	
	public default void m2() {
		System.out.println("in method of m2 in I1 interface");
	}
}
