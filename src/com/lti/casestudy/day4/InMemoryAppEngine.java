package com.lti.casestudy.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAppEngine implements AppEngine{

	List<Student> students = new ArrayList<Student>();
	List<Course> courses = new ArrayList<Course>();
	List<Enroll> enrollments = new ArrayList<Enroll>();

	@Override
	public void register(Student student) {
		students.add(student);
	}

	@Override
	public void introduce(Course course) {
		courses.add(course);
	}

	@Override
	public void enroll(Student student, Course course) {
		Enroll e = new Enroll(student, course, LocalDate.now());
		enrollments.add(e);
	}

	@Override
	public List<Student> listOfStudents() {
		return students;
	}

	@Override
	public List<Course> listOfCourses() {
		return courses;
	}

	@Override
	public List<Enroll> listOfEnrollments() {

		return enrollments;
	}
}