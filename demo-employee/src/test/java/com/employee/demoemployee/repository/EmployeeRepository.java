package com.employee.demoemployee.repository;

import com.employee.demoemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Optional<Employee> findByEmail(String email);
}
