package com.lti.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.lti.casestudy.day4.Student;

public class CollectionEx {
	public static void main(String[] args) {
		
		//Angular bracket notation is called as Generics in Java
		//what are doing is specifying what type of element we want to store in the Collection
		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("Python");
		list1.add(".NET");
		
		//using traditional loop
		
		System.out.println("---------Traditional Loop--------");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		//modern loop
		System.out.println("---------Modern Loop--------");
		for(String list:list1) {
			System.out.println(list);
		}
		
		//using lambda style
		System.out.println("---------Lambda Style--------");		
		list1.forEach(list -> System.out.println(list));
		
		//using Iterator
		System.out.println("---------Iterator Style--------");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Aayush", LocalDate.of(1998, 11, 06)));
//		for(Student student: students) {
//			
//			Scanner console = new Scanner(System.in);
//			System.out.println("Enter your id");
//			
//			int id = console.nextInt();
//
//			
//			System.out.println("Enter your name");
//			String name = console.next();
//
//			System.out.println("Enter your DOB");
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//			String temp = console.next();
//			LocalDate doBirth = LocalDate.parse(temp, formatter);
//			
//			//LocalDate doBirth = LocalDate.parse(temp);
//			//students[i].setDateOfBirth(LocalDate.parse(text));
//			
//			new Student(id, name, doBirth);
//		}
		
		//display students
		students.forEach(student -> System.out.println(student.getName()));
	}
}