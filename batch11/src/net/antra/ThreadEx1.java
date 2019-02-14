package net.antra;

public class ThreadEx1 implements Runnable{

	
	public static void main(String[] args) {
		
		ThreadEx1 th1=new ThreadEx1();
		ThreadEx1 th2=new ThreadEx1();
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.setName("manas");
		t2.setName("kumar");
		t1.start();
		t2.start();
		System.out.println("in main method");
		
		
		
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("in thread"+Thread.currentThread());
		}
	}
}
