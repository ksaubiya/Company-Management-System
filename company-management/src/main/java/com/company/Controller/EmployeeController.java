package com.company.Controller;

import com.company.Domain.Employee;
import com.company.Errors.BadRequestAlertException;
import com.company.Service.DTO.EmployeeDTO;
import com.company.Service.EmployeeService;
import com.company.Service.Mapper.EmployeeMapper;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }


    @PostMapping("/employee")
    public ResponseEntity<EmployeeDTO> create(@Valid @RequestBody EmployeeDTO employeeDTO) throws BadRequestAlertException {
        if (employeeDTO.getId() != null){
            throw new BadRequestAlertException("A new Employee cannot already have an Id");
        }
        EmployeeDTO savedEmp= employeeService.save(employeeDTO);
        Employee emp=employeeMapper.toEntity(employeeDTO);
        return ResponseEntity.ok(savedEmp);

    }
















}
