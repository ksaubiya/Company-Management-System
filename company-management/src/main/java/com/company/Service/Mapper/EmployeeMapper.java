package com.company.Service.Mapper;

import com.company.Domain.Employee;
import com.company.Service.DTO.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
}
