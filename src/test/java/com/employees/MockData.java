package com.employees;

import com.employees.models.Employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class MockData {
    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(getEmployee());
        employeeList.add(getEmployee2());
        return employeeList;
    }

    public static Employee getEmployee() {
        Employee mockEmployee = new Employee();
        mockEmployee.setId(1L);
        mockEmployee.setFirstName("John");
        mockEmployee.setMiddleName("M.");
        mockEmployee.setLastName("Doe");
        mockEmployee.setLocationCity("New York");
        mockEmployee.setAddress("123 Main St");
        mockEmployee.setDateBirth(getDate(1989, Calendar.JANUARY, 1));
        mockEmployee.setTelephone("123-456-7890");
        mockEmployee.setPositionTitle("Software Developer");
        mockEmployee.setHireDate(getDate(2020, Calendar.JANUARY, 1));
        mockEmployee.setEmail("john.doe@test.com");
        mockEmployee.setSalary(75000.00);
        mockEmployee.setTimeInPosition(3);

        return mockEmployee;
    }

    private static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }

    public static Employee getEmployee2() {
        Employee mockEmployee = new Employee();
        mockEmployee.setId(2L);
        mockEmployee.setFirstName("Jane");
        mockEmployee.setMiddleName("A.");
        mockEmployee.setLastName("Smith");
        mockEmployee.setLocationCity("Los Angeles");
        mockEmployee.setAddress("456 Elm St");
        mockEmployee.setDateBirth(getDate(1992, Calendar.FEBRUARY, 15));
        mockEmployee.setTelephone("987-654-3210");
        mockEmployee.setPositionTitle("UI/UX Designer");
        mockEmployee.setHireDate(getDate(2018, Calendar.JULY, 10));
        mockEmployee.setEmail("jane.smith@example.com");
        mockEmployee.setSalary(65000.00);
        mockEmployee.setTimeInPosition(5);

        return mockEmployee;
    }
}
