package net.antra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sample3 {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(1);
		li.add(2);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		//list.stream().forEach(i->System.out.println(i));
		list.parallelStream().forEach(i->System.out.println(i));
		/*List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		Predicate p=(obj)-> {
				Person p2=(Person)obj;
				if(p2.getAge()>20) {
					return true;
				}else {
					return false;
				}
			};
			

		Function<Person,Person> mapper=(per)->{
			if(per.getAge()%2!=0) {
				return per;
			}else {
				return new Person();
			}
			
			
		};
		List al=(List) list.stream().filter(p).map(mapper).collect(Collectors.toList());
		al.stream().forEach((obj)->{Person p1=(Person)obj; 
		System.out.println(p1.getName());});
		*/
		
		/*Consumer con=(obj)-> {Person p=(Person)obj; 
				System.out.print(p.getAge()+" ");
				System.out.print(p.getName()+" ");
				System.out.println(p.getGender());
				
		};*/
		
		/*list.stream().forEach((obj)-> {Person p=(Person)obj; 
		System.out.print(p.getAge()+" ");
		System.out.print(p.getName()+" ");
		System.out.println(p.getGender());
		});*/
		
		/*Iterator it=list.iterator();
		while(it.hasNext()) {
			//System.out.print(it.next())
			Person p=(Person)it.next();
			System.out.print(p.getAge()+" ");
			System.out.print(p.getName()+" ");
			System.out.println(p.getGender());
		}*/
		
		/*BiFunction<Integer,Integer ,Integer> biFunc=(Integer i,Integer j)->{
			return i+j;
		};
		
		
		Integer i=biFunc.apply(1, 2);
		System.out.println(i);*/
		/*Function<Integer,Integer> fun=(Integer i)->{
			
			return i+1;
		};
		
		Integer i2=fun.apply(19);
		System.out.println(i2);*/
		/*I3 i3= (i)->{
			i=i+1;
			System.out.println("in the method of m1 and in interface I3:"+i);
			};
			i3.m1(4);*/
	}
	
}
