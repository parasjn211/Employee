package com.employee.demoemployee.DTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonalInfoDTO {
    private String mobileNumber;
    private String gender;
    private LocalDate dob;
    private String experience;
    private String address;
}
