package com.controller;

import com.entity.EmployeeEntity;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/create")
    public String index(Model model) {
        EmployeeEntity employee = new EmployeeEntity();
        model.addAttribute("employee", employee);
        return "createEmployee";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute EmployeeEntity employeeEntity) {
        employeeService.createEmployee(employeeEntity);
        return "listEmployee";
    }

    @GetMapping("/list")
    public String getAll(Model model) {
        List<EmployeeEntity> list = employeeService.findAllEmployees();
        model.addAttribute("employees", list);
        return "listEmployee";
    }
}
