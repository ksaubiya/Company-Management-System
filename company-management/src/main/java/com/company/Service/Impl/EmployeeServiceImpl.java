package com.company.Service.Impl;

import com.company.Domain.Employee;
import com.company.Repository.EmployeeRepository;
import com.company.Service.DTO.EmployeeDTO;
import com.company.Service.EmployeeService;
import com.company.Service.Mapper.EmployeeMapper;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeMapper employeeMapper, EmployeeRepository employeeRepository) {
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        Employee employee=employeeMapper.toEntity(employeeDTO);
        employee=employeeRepository.save(employee);
        return employeeMapper.toDto(employee);
    }
}
