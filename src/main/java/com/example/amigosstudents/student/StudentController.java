package com.example.amigosstudents.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")    //http://localhost:8080/api/v1/student
public class StudentController {

    private final StudentService studentService;

    @Autowired //StudentService will be instantiated by Spring Framework (Dependency injection)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudents(student);
    }
}
