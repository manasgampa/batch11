package net.antra;

public class ThreadEx2 extends Thread{
	
	public static void main(String[] args) {
		ThreadEx2 t1=new ThreadEx2();
		t1.start();
	}
	
	public void run() {
		System.out.println("in thread");
	}

}
