package com.antra.interviewPrep.restfulAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService es;

    @Autowired
    public EmployeeController(EmployeeService es) {
        this.es = es;
    }



    @GetMapping
    public List<Object[]> getAllEmployee(){
        return es.getAllEmployee();
    }

    @GetMapping("/{name}")
    public Employee getEmployeeByEmployeeName(@PathVariable("name") String name){
        return es.getEmployeeByEmployeeName(name);
    }

}
