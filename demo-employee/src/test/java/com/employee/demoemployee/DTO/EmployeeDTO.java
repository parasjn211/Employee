package com.employee.demoemployee.DTO;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private String name;
    private String email;
    private String password;
}
