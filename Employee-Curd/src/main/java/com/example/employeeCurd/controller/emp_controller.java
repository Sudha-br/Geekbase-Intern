package com.example.employeeCurd.controller;

import com.example.employeeCurd.entity.employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface emp_controller {
    @GetMapping("/")
    public String home();

    @GetMapping("/employees")
    public List<employee> getAllEmployees();

    @PostMapping("/add/employee")
    public employee addEmployee(@RequestBody employee e);

    @PutMapping("/update/employee")
    public void updateEmployee(@RequestBody employee e);

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id);

}
