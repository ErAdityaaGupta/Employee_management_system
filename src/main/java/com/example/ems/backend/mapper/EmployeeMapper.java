package com.example.ems.backend.mapper;

import com.example.ems.backend.dto.EmployeeDto;
import com.example.ems.backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getEmail(), employee.getLastName());
    }

    public static Employee toEntity(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getEmail(), employeeDto.getLastName());
    }
}
