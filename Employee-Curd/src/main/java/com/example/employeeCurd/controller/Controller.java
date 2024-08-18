package com.example.employeeCurd.controller;

import com.example.employeeCurd.service.service;
import com.example.employeeCurd.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller implements emp_controller{
    @Autowired
    service s;

    @Autowired
    employee e;

    @Override
    public String home(){
        return "Welcome to spring boot CURD operation";
    }

    @Override
    public List<employee> getAllEmployees(){
        List<employee> e = s.get();
        return e;
    }

    @Override
    public employee addEmployee(employee e){
        s.add(e);
        return e;
    }

    @Override
    public void updateEmployee(employee e){
        s.update(e);
    }

    @Override
    public void deleteEmployee(int id){
        s.delete(id);
    }
}
