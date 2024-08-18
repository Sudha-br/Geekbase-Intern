package com.example.employeeCurd.service;

import com.example.employeeCurd.Repository.repo;
import com.example.employeeCurd.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service implements emp_service{
    @Autowired
    repo r;

    @Autowired
    employee e;

    @Override
    public List<employee> get(){
      List<employee> e= r.findAll();
      return e;
    }
    @Override
    public void add(employee e){
        r.save(e);
    }

    @Override
    public void update(employee e){
        r.save(e);
    }

    @Override
    public void delete(int id){
        r.deleteById(id);
    }

}
