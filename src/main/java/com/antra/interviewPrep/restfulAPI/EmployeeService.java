package com.antra.interviewPrep.restfulAPI;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Object[]> getAllEmployee();
    Employee getEmployeeByEmployeeName(String name);
}
