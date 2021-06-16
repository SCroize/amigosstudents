package com.example.amigosstudents.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Interface responsible for data access
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT a FROM steudent s WHERE s.email = ?1") //JBQL not straight SQL
    Optional<Student> findStudentByEmail(String email);
}
