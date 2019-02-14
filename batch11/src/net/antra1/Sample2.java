package net.antra1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import net.antra.Books;
import net.antra.I1;
import net.antra.Parent;
import net.antra.Person;
import net.antra.Student;

public class Sample2 {

	public static void main(String[] args) {
		
		Books bk=new Books();
		bk.m2();
		I1.m3();
		/*List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		int k=3%3;
		System.out.println(k);
		
	//	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
		list.stream().forEach(i->System.out.println(i));
		System.out.println("in other call");*/
		//List al=list.stream().filter(i->i%2!=0).map(i->{return i+1;}).collect(Collectors.toList());
		//System.out.println(al);
		//list.parallelStream().forEach(System.out::println);
		/*int i=10;
		
		Integer i1=new Integer(12);
		*/
		/*Student st=new Student();
		
		Parent p=new Parent();//system classloader
		
		Scanner sc=new Scanner(System.in);//Boot strap loader
		*/
	//	new oracle.jdbc.driver.OracleDriver();//Extension class loaders
		
		}

	
}
