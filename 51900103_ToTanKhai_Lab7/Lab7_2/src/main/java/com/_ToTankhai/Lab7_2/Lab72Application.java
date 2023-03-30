package com._ToTankhai.Lab7_2;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com._ToTankhai.Lab7_2.model.Student;
import com._ToTankhai.Lab7_2.service.StudentService;

@SpringBootApplication
public class Lab72Application implements CommandLineRunner {

	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(Lab72Application.class, args);
	}

	private void showStudents() {
		List<Student> studentList = (List<Student>) this.studentService.getAllStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(1L, "Khai", 18, "khai@tdtu.edu.vn", 6.5);
		Student student2 = new Student(2L, "Nghia", 19, "nghia@tdtu.edu.vn", 5.5);
		Student student3 = new Student(3L, "Son", 18, "son@tdtu.edu.vn", 5.0);
		this.studentService.save(student1);
		this.studentService.save(student2);
		this.studentService.save(student3);

		showStudents();
		System.out.println("After updating student:");

		student1.setIeltsScore(8.0);
		this.studentService.save(student1);
		showStudents();
		System.out.println("After deleting student:");
		this.studentService.deleteStudent(1L);
		showStudents();
	}

}
