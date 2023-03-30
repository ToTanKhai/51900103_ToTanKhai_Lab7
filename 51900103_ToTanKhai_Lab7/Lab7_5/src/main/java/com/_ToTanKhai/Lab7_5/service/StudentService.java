package com._ToTanKhai.Lab7_5.service;

import java.util.List;

import com._ToTanKhai.Lab7_5.model.Student;

public interface StudentService {
public Iterable<Student> getAllStudent();
	
	public Student getStudent(long id) throws Exception;
	
	public void deleteStudent(long id);
	
	public Student save(Student student);

	public List<Student> searchByAge(int age);

	public List<Student> searchByIeltsScore(double ieltsScore);

	public List<Student> searchByName(String name);
}
