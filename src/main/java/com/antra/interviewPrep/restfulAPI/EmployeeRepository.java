package com.antra.interviewPrep.restfulAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(
            value = "SELECT e.employee_age, count(e), array_to_string(array_agg(e.employee_name), ', ') FROM Employee e GROUP BY e.employee_age",
            nativeQuery = true)
    List<Object[]> findAllGroupByAge();

   // @Query("SELECT e FROM Employee e WHERE e.employeeName = name")
    Employee getEmployeeByEmployeeName(String name);
}
