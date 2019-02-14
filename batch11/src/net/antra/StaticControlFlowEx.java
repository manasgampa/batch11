package net.antra;

public class StaticControlFlowEx {
	
	static int x=10;
	static {
		//m1();
		System.out.println(x);
		
		System.out.println("in static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("in main method");
	}
	
	public static void m1() {
		//System.out.println(x);
		System.out.println("in m1 method");
		System.out.println(y);
		
	}
	
	static {
		
		System.out.println("in static block 2");
	}
	
	static int y=20;
}
