package com.employees.controller;

import com.employees.MockData;
import com.employees.models.Employee;
import com.employees.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class EmployeeControllerTest {
    @InjectMocks
    private EmployeeController employeesController;
    @Mock
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() {
        List<Employee> employeeList = MockData.getEmployees();
        Mockito.when(employeeService.listEmployees()).thenReturn(employeeList);
        List<Employee> result = employeesController.listEmployees();
        Assertions.assertEquals(employeeList, result);
    }

    @Test
    public void testGetEmployeeById() {
        Long id = 1L;
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeService.getEmployeeDetails(id)).thenReturn(employee);
        Employee result = employeesController.getEmployeeDetails(id);
        Assertions.assertEquals(employee, result);
    }

    @Test
    public void testInsertEmployee() {
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeService.saveEmployee(employee)).thenReturn(employee);
        Employee result = employeesController.insertEmployee(employee);
        Assertions.assertEquals(employee, result);
    }

    @Test
    public void testEditEmployee() {
        Long id = 1L;
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeService.editEmployee(id, employee)).thenReturn(employee);
        Employee result = employeesController.editEmployee(id, employee);
        Assertions.assertEquals(employee, result);
    }
}
