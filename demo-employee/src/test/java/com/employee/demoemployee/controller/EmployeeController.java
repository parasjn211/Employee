package com.employee.demoemployee.controller;

import com.employee.demoemployee.DTO.RegistrationRequest;
import com.employee.demoemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<String> registerEmployee(@RequestBody RegistrationRequest request) {
        String response = employeeService.registerEmployee(request.getEmployee(), request.getPersonalInfo());
        return ResponseEntity.ok(response);
    }
}
