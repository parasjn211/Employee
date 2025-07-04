package com.employee.demoemployee.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    private EmployeeDTO employee;
    private PersonalInfoDTO personalInfo;
}
