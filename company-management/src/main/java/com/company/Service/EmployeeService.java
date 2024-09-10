package com.company.Service;

import com.company.Service.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDTO save(EmployeeDTO employeeDTO);
}
