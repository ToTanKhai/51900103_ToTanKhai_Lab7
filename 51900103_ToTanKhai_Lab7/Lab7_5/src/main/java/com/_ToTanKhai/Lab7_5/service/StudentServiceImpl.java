package com._ToTanKhai.Lab7_5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com._ToTanKhai.Lab7_5.service.StudentService;
import com._ToTanKhai.Lab7_5.model.Student;
import com._ToTanKhai.Lab7_5.repository.StudentRepository;

public class StudentServiceImpl  implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Iterable<Student> getAllStudent(){return studentRepository.findAll(); };
	
	@Override
	public Student getStudent(long id) throws Exception {
		return studentRepository.findById(id).orElseThrow(() -> new Exception("Student not found"));
	}
	
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	};
	
	@Override
	public Student save(Student student) {return studentRepository.save(student);}
	
	@Override
	public List<Student> searchByAge(int age){
		return (List<Student>) studentRepository.searchByAge(age);
	};

	@Override
	public List<Student> searchByIeltsScore(double ieltsScore) {
		return studentRepository.searchByIeltsScore(ieltsScore);
	};

	public List<Student> searchByName(String name){
		return studentRepository.searchByName(name);
	};
}
