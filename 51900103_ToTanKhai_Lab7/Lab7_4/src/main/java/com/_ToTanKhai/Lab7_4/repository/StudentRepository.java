package com._ToTanKhai.Lab7_4.repository;
import java.util.List;

import org.springframework.data.repository.*;

import com._ToTanKhai.Lab7_4.model.Student;
public interface StudentRepository extends CrudRepository<Student, Long> {
	public List<Student> findByAgeGreaterThanEqual(Integer age);
	
	public List<Student> findByIeltsScore(Double ieltsScore);
	
	List<Student> findByNameContaining(String keyword);

}
