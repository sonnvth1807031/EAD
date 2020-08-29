package com.service;

import com.entity.EmployeeEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity employeeEntity);
    List<EmployeeEntity> findAllEmployees();
}
