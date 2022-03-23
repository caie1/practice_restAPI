package com.antra.interviewPrep.restfulAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name="Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String employeeName;

    private Integer employeeSalary;

    private Integer employeeAge;

    private byte[] profileImage;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_name='" + employeeName + '\'' +
                ", employee_salary=" + employeeSalary +
                ", employee_age=" + employeeAge +
                ", profile_image=" + Arrays.toString(profileImage) +
                '}';
    }
}
