package com.lti.casestudy.day1;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	//	scenario1();
	
		//scenario2();
		
		scenario3();
	}
	
/*	
	public static void scenario1() {
		Student stu1 = new Student(1, "Rohit", LocalDate.of(1998, 10, 18));
		Student stu2 = new Student(2, "Ram", LocalDate.of(1997, 12, 19));
		Student stu3 = new Student(3, "Ravi", LocalDate.of(1999, 12, 20));
		
		Info i1 = new Info();
		i1.display(stu1);
		i1.display(stu2);
		i1.display(stu3);
	}
	
*/	
/*	
	private static void scenario2() {
		//syntax to create an array for the above requirement
		Student[] students = new Student[3];
		
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		
		students[0].setId(4);
		students[0].setName("Akash");
		students[0].setDateOfBirth(LocalDate.of(2002, 12, 8));
		
		students[1].setId(5);
		students[1].setName("Akash");
		students[1].setDateOfBirth(LocalDate.of(2002, 11, 8));
		
		students[2].setId(6);
		students[2].setName("Gagan");
		students[2].setDateOfBirth(LocalDate.of(2003, 12, 8));
		
		for(int i=0;i<students.length;i++) {
			Info i1 = new Info();
			i1.display(students[i]);
		}
	}
	*/
	private static void scenario3() {
		
		Student[] students = new Student[3];
		
		for(int i=0;i<students.length;i++) {
			Scanner console = new Scanner(System.in);
			
			students[i] = new Student();
			
			
			System.out.println("Enter your id");
			
			int id = console.nextInt();
			students[i].setId(id);

			
			System.out.println("Enter your name");
			String name = console.next();
			students[i].setName(name);

			System.out.println("Enter your DOB");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String temp = console.next();
			LocalDate doBirth = LocalDate.parse(temp, formatter);
			
			//LocalDate doBirth = LocalDate.parse(temp);
			//students[i].setDateOfBirth(LocalDate.parse(text));
			students[i].setDateOfBirth(doBirth);


		}
		//for(Student student: students)
		for(int i=0;i<students.length;i++) {
			{Info i1 = new Info();
			i1.display(students[i]);
			//i1.display(student);
		}
	}}}