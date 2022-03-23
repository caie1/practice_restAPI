package com.antra.interviewPrep.restfulAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Object[]> getAllEmployee() {
        return repository.findAllGroupByAge();
    }

    @Override
    public Employee getEmployeeByEmployeeName(String name) {
        return repository.getEmployeeByEmployeeName(name);
    }
}
