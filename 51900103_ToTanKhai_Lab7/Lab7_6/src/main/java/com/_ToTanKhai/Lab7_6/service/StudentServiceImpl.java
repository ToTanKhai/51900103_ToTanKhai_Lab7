package com._ToTanKhai.Lab7_6.service;

import org.springframework.data.domain.Sort;

import com._ToTanKhai.Lab7_6.model.Student;
import com._ToTanKhai.Lab7_6.repository.StudentRepository;
import com._ToTanKhai.Lab7_6.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentRepository studentRepository;
	@Override
	public Iterable<Student> getAllStudens(){
		return studentRepository.findAll(Sort.by("age").ascending().and(Sort.by("ieltsScore")));
	};
	
	public Iterable<Student> getCustomizedStudentList(){
		
		
		return Iterabable<Student>;
	};
	
	public Student save(Student student) {
		return studentRepository.save(student);
	};
}
