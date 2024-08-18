package com.example.employeeCurd.Repository;

import com.example.employeeCurd.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<employee,Integer> {
}
