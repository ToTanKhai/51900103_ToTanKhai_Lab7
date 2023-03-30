package com._ToTanKhai.Lab7_5.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com._ToTanKhai.Lab7_5.model.Student;

public interface StudentRepository  extends CrudRepository<Student, Long>  {

	@Query("Select * from Student s Where s.age >= :age")
	public Collection<Student> searchByAge(@Param("age") Integer age);
	
	@Query("Select * from Student s Where s.ieltsScore >= :ieltsScore")
	public List<Student> searchByIeltsScore(@Param("ieltsScore") Double ieltsScore);
	
	@Query("Select * from Student s Where s.name >= %:keyword%")
	List<Student> searchByName(@Param("keyword") String keyword);
	
}
