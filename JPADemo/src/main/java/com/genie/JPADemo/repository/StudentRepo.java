package com.genie.JPADemo.repository;

import com.genie.JPADemo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
}
