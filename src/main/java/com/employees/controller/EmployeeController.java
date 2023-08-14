package com.employees.controller;

import com.employees.models.Employee;
import com.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> listEmployees() {
        return employeeService.listEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable Long id) {
        return employeeService.getEmployeeDetails(id);
    }

    @PostMapping
    public Employee insertEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee editEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.editEmployee(id, employee);
    }
}
