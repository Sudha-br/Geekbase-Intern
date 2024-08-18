package com.example.employeeCurd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
@Entity
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private int emp_salary;
}
