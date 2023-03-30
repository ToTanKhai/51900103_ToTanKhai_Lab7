package com._ToTanKhai.Lab7_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import com._ToTanKhai.Lab7_3.model.Student;
import com._ToTanKhai.Lab7_3.service.StudentService;




@SpringBootApplication
public class Lab73Application implements CommandLineRunner{

	private StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(Lab73Application.class, args);
	}

	
	private void showStudents() {
		List<Student> studentList = (List<Student>) this.studentService.getAllStudent();
		for (Student  student: studentList) {
			System.out.println(student);
		}
	}
	
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
