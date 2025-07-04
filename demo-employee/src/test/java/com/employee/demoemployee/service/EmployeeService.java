package com.employee.demoemployee.service;

import com.employee.demoemployee.DTO.EmployeeDTO;
import com.employee.demoemployee.DTO.PersonalInfoDTO;

public interface EmployeeService {
    String registerEmployee(EmployeeDTO employeeDTO, PersonalInfoDTO personalInfoDTO);
}
