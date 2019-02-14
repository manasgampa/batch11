package net.antra;

import java.util.Comparator;

public class SortEx implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2) {
			return 1;
		}else if(i1>i2) {
			
			return -1;
		}else {
			return 0;
		}
		
		
	}

}
