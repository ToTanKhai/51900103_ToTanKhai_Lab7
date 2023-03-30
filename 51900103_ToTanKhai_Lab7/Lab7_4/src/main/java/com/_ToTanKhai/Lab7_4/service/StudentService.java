package com._ToTanKhai.Lab7_4.service;

import java.util.List;

import com._ToTanKhai.Lab7_4.model.Student;

public interface StudentService {

	public Iterable<Student> getAllStudent();
	
	public Student getStudent(long id) throws Exception;
	
	public void deleteStudent(long id);
	
	public Student save(Student student);

	public List<Student> findStudentAgeGreaterThanEqual(int age);

	public List<Student> countStudentWithIeltsScore(double d);

	public List<Student> searchStudentByName(String string);
	

	
}
