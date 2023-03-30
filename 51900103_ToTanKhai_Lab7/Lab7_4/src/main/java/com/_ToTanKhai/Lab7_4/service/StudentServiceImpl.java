package com._ToTanKhai.Lab7_4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com._ToTanKhai.Lab7_4.service.StudentService;
import com._ToTanKhai.Lab7_4.model.Student;
import com._ToTanKhai.Lab7_4.repository.StudentRepository;

public class StudentServiceImpl  implements StudentService{
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
	public List<Student> findStudentAgeGreaterThanEqual(int age){
		return studentRepository.findByAgeGreaterThanEqual(age);
	};

	@Override
	public List<Student> countStudentWithIeltsScore(double ieltsScore) {
		return studentRepository.findByIeltsScore(ieltsScore);
	};

	public List<Student> searchStudentByName(String name){
		return studentRepository.findByNameContaining(name);
	};
}
