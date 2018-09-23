package com.greenfoxacademy.greenfoxclass.controllers;

import com.greenfoxacademy.greenfoxclass.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  StudentService studentService;

  @GetMapping("/gfa")
  public String index() {
    return "index";
  }

  @GetMapping("/gfa/list")
  public String showStudentsList(Model model) {
    List<String> students = studentService.findAll();
    model.addAttribute("students", students);
    return "students";
  }
}
