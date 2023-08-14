package com.employees.service;

import com.employees.MockData;
import com.employees.models.Employee;
import com.employees.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class EmployeeServiceTest {
    @InjectMocks
    private EmployeeService employeeService;
    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    public void testGetEmployees() {
        List<Employee> employeeList = MockData.getEmployees();
        Mockito.when(employeeRepository.findAll()).thenReturn(employeeList);
        List<Employee> result = employeeService.listEmployees();
        Assertions.assertEquals(employeeList, result);
    }

    @Test
    public void testGetEmployeeById() {
        Long id = 1L;
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.of(employee));
        Employee result = this.employeeService.getEmployeeDetails(id);
        Assertions.assertEquals(employee, result);
    }

    @Test
    public void saveEmployee() {
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        Employee result = employeeService.saveEmployee(employee);
        Assertions.assertEquals(employee, result);
    }

    @Test
    public void editEmployee() {
        Long id = 1L;
        Employee employee = MockData.getEmployee();
        Mockito.when(employeeRepository.existsById(id)).thenReturn(true);
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        Employee result = employeeService.editEmployee(id, employee);
        Assertions.assertEquals(employee, result);
    }
}
