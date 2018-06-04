package com.fpoly.controller;

import com.fpoly.model.Major;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpoly.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @RequestMapping(value = "/index") //Link trên trình duyệt
    public String index(ModelMap model) {
        Student student = new Student("Trần Trung Hiếu", 10, "Ứng dụng phần mềm");
        model.addAttribute("student", student);
        return "/student4";//Tên trang .jsp
    }
//
//    // Bài 3
//    @ModelAttribute("majors")
//    public Map<String, String> getMajors() {
//        Map<String, String> majors = new HashMap<>();
//        majors.put("UD", "Ứng dụng phần mềm");
//        majors.put("WEB", "Thiết kế trang web");
//        return majors;
//    }


    //Bài 4
    @ModelAttribute("majors")
    public List<Major> getListMajors() {
        List<Major> majors = new ArrayList<>();
        majors.add(new Major("APP", "Ứng dụng phần mềm"));
        majors.add(new Major("WEB", "Thiết kế trang web"));
        return majors;
    }

}
