package com.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        System.out.println("Initializing Application Context....");

        StudentService studentService = context.getBean("xyz", StudentService.class);

        String studentName = studentService.getStudent().getStudentName();
        System.out.println("studentName..........." + studentName);

        ((FileSystemXmlApplicationContext)context).close();
        System.out.println("Closing Application Context....");
    }
}
