package kz.bitlab.springboot.techboot.controller;

import kz.bitlab.springboot.techboot.db.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
   static final List<Student> students = new ArrayList<>();
    private  static  Long id = 5L;
   static  {
       students.add(new Student(1L,"Ilyas","Zhuanyshev",88)) ;
       students.add(new Student(2L,"Serik","Erikov",91)) ;
       students.add(new Student(3L,"Erik","Serikov",65)) ;
       students.add(new Student(4L,"Nurzhan","Bolatov",48)) ;
    }

    public  static  List<Student> getStudents(){
       return students;
    }

    public  static  void  addStudent(Student student){
       student.setId(id);
       id++;
       students.add(student);
    }

}
