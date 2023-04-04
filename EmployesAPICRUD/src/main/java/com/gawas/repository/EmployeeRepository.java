package com.gawas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gawas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	
}
