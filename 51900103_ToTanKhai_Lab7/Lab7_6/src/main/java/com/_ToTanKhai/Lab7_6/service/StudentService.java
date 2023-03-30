package com._ToTanKhai.Lab7_6.service;

import com._ToTanKhai.Lab7_6.model.Student;

public interface StudentService {

	public Iterable<Student> getAllStudens();
	
	public Iterable<Student> getCustomizedStudentList();
	
	public Student save(Student student);
	
}
