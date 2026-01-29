package com.company.employeetaskmanager.controller;

import com.company.employeetaskmanager.model.Employee;
import com.company.employeetaskmanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @GetMapping("/count")
    public long count() {
        return employeeService.count();
    }

    @GetMapping("/sorted")
    public List<Employee> findAllSorted() {
        return employeeService.findAllByOrderByName();
    }

    @GetMapping("/search/{name}")
    public List<Employee> findByName(@PathVariable String name) {
        return employeeService.findByName(name);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id,
                           @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.deleteById(id);
    }
}
