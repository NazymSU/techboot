package kz.bitlab.springboot.techboot.controller;

import kz.bitlab.springboot.techboot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public  String homePage(Model model){
        List<Student> studentArrayList = DBManager.getStudents();
        model.addAttribute("studentter",studentArrayList);
        return "index";
    }
    @PostMapping (value = "/add-student")
    public  String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
    @GetMapping (value = "/add-student")
    public String addStudentPage (Model model){
        List<Student> studentArrayList = DBManager.getStudents();
        model.addAttribute("stud",studentArrayList);
        return "addStudent";
    }
}
