package com.employees.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String locationCity;
    private String address;
    private Date dateBirth;
    private String telephone;
    private String positionTitle;
    private Date hireDate;
    private String email;
    private Double salary;
    private Integer timeInPosition;

}
