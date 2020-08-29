package com.service.impl;

import com.entity.EmployeeEntity;
import com.repository.EmployeeRepo;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeRepo.save(employeeEntity);
        return employee;
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        List<EmployeeEntity> results = employeeRepo.findAll();
        return results;
    }
}
