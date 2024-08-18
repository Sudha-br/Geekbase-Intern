package com.example.employeeCurd.service;

import com.example.employeeCurd.entity.employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface emp_service {
    public List<employee> get();
    public void add(employee e);
    public void update(employee e);
    public void delete(int id);
}
