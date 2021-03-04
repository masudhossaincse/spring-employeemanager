package com.masud.employeemanager.repo;

import com.masud.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
