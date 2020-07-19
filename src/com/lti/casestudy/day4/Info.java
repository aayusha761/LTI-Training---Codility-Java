package com.lti.casestudy.day4;


public class Info {
	public void display(Student student) {
		
		System.out.println("-----Student Details-----");
		System.out.println(student.getName());
		System.out.println(student.getDateOfBirth());
		System.out.println(student.getId());
	}
	
	public void display(Course course) {
			
		System.out.println("-----Course Details-----");
		System.out.println(course.getId());
		System.out.println(course.getName());
		System.out.println(course.getDuration());
		System.out.println(course.getFees());
	}
	
	public void display(Enroll enroll) {
			
		System.out.println("-----Enroll Details-----");
		display(enroll.getCourse());
		System.out.println(enroll.getEnrollmentDate());
		display(enroll.getStudent());
	}
}