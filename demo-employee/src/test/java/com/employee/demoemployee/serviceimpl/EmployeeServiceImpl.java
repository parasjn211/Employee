package com.employee.demoemployee.serviceimpl;

import com.employee.demoemployee.DTO.EmployeeDTO;
import com.employee.demoemployee.DTO.PersonalInfoDTO;
import com.employee.demoemployee.entity.Employee;
import com.employee.demoemployee.entity.PersonalInfo;
import com.employee.demoemployee.repository.EmployeeRepository;
import com.employee.demoemployee.repository.PersonalInfoRepository;
import com.employee.demoemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public String registerEmployee(EmployeeDTO employeeDTO, PersonalInfoDTO personalInfoDTO) {

        // Check if email already exists
        if (employeeRepository.findByEmail(employeeDTO.getEmail()).isPresent()) {
            return "Employee with this email already exists";
        }

        // Create and save employee
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPassword(passwordEncoder.encode(employeeDTO.getPassword()));

        employee = employeeRepository.save(employee);  // Save to get generated ID

        // Create and save personal info
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setMobileNumber(personalInfoDTO.getMobileNumber());
        personalInfo.setGender(personalInfoDTO.getGender());
        personalInfo.setDob(personalInfoDTO.getDob());
        personalInfo.setExperience(personalInfoDTO.getExperience());
        personalInfo.setAddress(personalInfoDTO.getAddress());
        personalInfo.setEmployee(employee); // Link to employee

        personalInfoRepository.save(personalInfo);

        return "Employee registered successfully";
    }
}
