package net.antra;

import java.util.ArrayList;
import java.util.Iterator;

public class Test{

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(2);//Object Array Data structure
		al.add(12);
		al.add(34);
		al.add(45.32);
		al.add(new Emp(5));
		al.add(12);
		
		System.out.println(al.get(1));
		al.add(2, 'c');
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		/*for(int i=0;i<al.size();i++) {
			
			
			System.out.println(al.get(i));
		}*/
		
		/*for(Object o:al) {
			
			System.out.println(o);
		}*/
		
		
		
	}

}
