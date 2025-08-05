package com.Callofcoders.EmployeeManage.Employee.management.services;

import com.Callofcoders.EmployeeManage.Employee.management.dtos.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    EmployeeDto getEmployeeById(Long id);

    EmployeeDto createNewEmployee(EmployeeDto employeeDto);

    EmployeeDto updateById(Long id, EmployeeDto employeeDto);

    void deleteById(Long employeeId);
}
