package com.northwest.service;

import com.northwest.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public interface EmployeeService {
    String saveEmployee(EmployeeDto employeeDto) throws IOException;
}
