package br.gov.sp.fatec.cliente.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.cliente.entites.Student;

@RestController
@RequestMapping("students")
public class StudentControlller {

    @GetMapping
    public List<Student> getStudents() {

        Student s1 = new Student();
        s1.setCourse("ADS");
        s1.setId(1);
        s1.setName("Kaue Simao da Silva");

        Student s2 = new Student();
        s2.setCourse("ADS");
        s2.setId(2);
        s2.setName("Nicolas de Oliveira Valle");

        Student s3 = new Student();
        s3.setCourse("ADS");
        s3.setId(3);
        s3.setName("Julio Cesar");

        Student s4 = new Student();
        s4.setCourse("ADS");
        s4.setId(4);
        s4.setName("William Fernandes Silva");
        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        return list;

    }

}
