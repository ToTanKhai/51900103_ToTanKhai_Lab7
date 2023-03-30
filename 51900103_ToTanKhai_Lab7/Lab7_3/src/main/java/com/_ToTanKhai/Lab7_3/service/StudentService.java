package com._ToTanKhai.Lab7_3.service;

import java.util.List;

import com._ToTanKhai.Lab7_3.model.Student;

public interface StudentService {

	public Iterable<Student> getAllStudent();
	
	public Student getStudent(long id) throws Exception;
	
	public void deleteStudent(long id);
	
	public Student save(Student student);

	
}