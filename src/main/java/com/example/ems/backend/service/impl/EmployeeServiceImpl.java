package com.example.ems.backend.service.impl;

import com.example.ems.backend.dto.EmployeeDto;
import com.example.ems.backend.repo.EmployeeRepo;
import com.example.ems.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }
}
