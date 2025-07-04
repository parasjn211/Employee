package com.employee.demoemployee.entity;

import jakarta.persistence.*;
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
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mobileNumber;
    private String gender;
    private LocalDate dob;
    private String experience;
    private String address;

    @OneToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Employee employee;
}
