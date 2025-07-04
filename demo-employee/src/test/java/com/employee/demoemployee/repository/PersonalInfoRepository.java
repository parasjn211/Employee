package com.employee.demoemployee.repository;

import com.employee.demoemployee.entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long> {
    @Query("SELECT p FROM PersonalInfo p WHERE p.employee.id = :empId")
    PersonalInfo findByEmployeeId(Long empId);
}
