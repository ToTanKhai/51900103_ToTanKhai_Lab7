package com._ToTanKhai.Lab7_3.repository;

import org.springframework.data.repository.*;

import com._ToTanKhai.Lab7_3.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
