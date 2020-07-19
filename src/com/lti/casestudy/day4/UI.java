package com.lti.casestudy.day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class UI {
	AppEngine appEngine = new InMemoryAppEngine();
	Info info = new Info();
	Scanner console = new Scanner(System.in);
	
	public void showMainScreen() {
		System.out.println("Welcome to Student Management System (SMS) v1.0");
		System.out.println("Tell us who you are 1.Student or 2. Admin");
		System.out.println("Enter your Choice");
		
		int choice = Integer.parseInt(console.nextLine());
		
		switch(choice) {
			case 1:
				showStudentScreen();
				break;
			case 2:
				showAdminScreen();
				break;
		}
	}

	public void showAdminScreen() {
		System.out.println("Welcome Admin");
		System.out.println("1. Add new Course\n 2. Browse all the Courses\n 3.Show All the students\n 4. Browse all the enrollments");
		System.out.println("Enter choice (1-3)");
		
//		Scanner console = new Scanner(System.in);
		int choice = Integer.parseInt(console.nextLine());
		switch(choice) {
			case 1:
				showAddCourseScreen();
				break;
			case 2:
				showAllCoursesScreen();
				break;
			case 3:
				showAllStudentsScreen();
				break;
			case 4:
				showAllEnrollmentsScreen();
				break;
		}
	}

	private void showAllEnrollmentsScreen() {
		appEngine.listOfEnrollments();
		showMainScreen();
	}

	private void showAddCourseScreen() {
		Course c = new Course(1, "Java", 4, 1500);
		appEngine.introduce(c);
		info.display(c);
		showMainScreen();
	}

	private void showAllStudentsScreen() {
		
		List<Student> students = appEngine.listOfStudents();
		for(Student stu:students)
			info.display(stu);
		showMainScreen();
	}

	private void showAllCoursesScreen() {
		
		List<Course> course = appEngine.listOfCourses();
		for(Course c:course)
			info.display(c);
		showMainScreen();
	}
	
	public void showEnrollCourseScreen() {
//		Scanner console = new Scanner(System.in);
		
		Course course = new Course();
		
		System.out.println("Enter course id");
		
		int id = console.nextInt();
		course.setId(id);

		
		System.out.println("Enter course name");
		String name = console.next();
		course.setName(name);
		
		int duration = console.nextInt();
		course.setDuration(duration);
		
		int fees = console.nextInt();
		course.setId(fees);

		Student student = new Student(1, "arora", LocalDate.of(1988, 04, 02));
		appEngine.enroll(student, course);
		
		System.out.println("You have successfully registered...");
		showMainScreen();
		
	}

	public void showStudentScreen() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Student");
		System.out.println("1. Register\n 2.Browse all courses\n 3. Enroll for a Course");
		System.out.println("Enter your choice:");
		
//		Scanner console = new Scanner(System.in);
		int choice = Integer.parseInt(console.nextLine());
		
		switch(choice) {
			case 1:
				showRegisterScreen();
				break;
			case 2:
				showAllCoursesScreen();
				break;
			case 3:
				showEnrollCourseScreen();
		}
	}


	public void showRegisterScreen() {
		
		Scanner console = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter your id");
		
		int id = console.nextInt();
		student.setId(id);

		
		System.out.println("Enter your name");
		String name = console.next();
		student.setName(name);

		System.out.println("Enter your DOB (dd-mm-yyyy)");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String temp = console.next();
		LocalDate doBirth = LocalDate.parse(temp, formatter);
		
		student.setDateOfBirth(doBirth);

		appEngine.register(student);
		
		System.out.println("You have successfully registered...");
		showMainScreen();
	}
}