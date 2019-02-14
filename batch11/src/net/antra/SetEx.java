package net.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortEx());
		/*ts.add(45);
		ts.add(56);
		ts.add(67);
		ts.add(63);
		ts.add(14);
		ts.add(56);
		ts.add(32);
		ts.add(12);*/
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		//ts.add("abc");
		System.out.println(ts);
		
		Iterator it=ts.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		/*LinkedHashSet hs=new LinkedHashSet();//HashTable DS
		hs.add(12);
		hs.add("manas");
		hs.add(56);
		hs.add(54.32);
		hs.add("manas kumar");
		hs.add(4523);
		hs.add(67);
		hs.add(12);
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}*/
		/*for(int i=0;i<hs.size();i++) {
			
			System.out.println(hs.);
		}*/
		
		
	}
}
