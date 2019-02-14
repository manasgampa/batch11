package net.antra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	public static void main(String[] args) {
		ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(1, "manas");
		hm.put(54, new Emp(12));
		hm.put(3, 34);
		hm.put(43, 56);
		hm.put(32, 45.34);
		hm.put(1, "kumar");
		hm.put("Yekai","kumar");
		//System.out.println(hm);
		
		Set set=hm.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			hm.put(56, "ning");
		}
		Map map2=Collections.unmodifiableMap(hm);
		map2.put("jiyayi", 1);
	}
}
