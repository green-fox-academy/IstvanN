package com.greenfoxacademy.greenfoxclass.controllers;

import com.greenfoxacademy.greenfoxclass.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String index(Model model) {
    model.addAttribute("count", studentService.countStudents());
    return "index";
  }

  @GetMapping("/gfa/list")
  public String showStudentsList(Model model) {
    List<String> students = studentService.findAll();
    model.addAttribute("students", students);
    return "students";
  }

  @GetMapping("/gfa/add")
  public String showAddForm() {
    return "add-student-form";
  }

  @PostMapping("/gfa/save")
  public String addNewStudent(@RequestParam("name") String student) {
    studentService.save(student);
    return "redirect:/gfa";
  }

  @GetMapping("/gfa/check")
  public String checkStudent() {
    return "student-checker";
  }
}
