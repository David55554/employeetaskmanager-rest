package com.company.employeetaskmanager.service;

import com.company.employeetaskmanager.model.Employee;
import com.company.employeetaskmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findAllByOrderByName() {
        return employeeRepository.findAllByOrderByName();
    }

    public long count() {
        return employeeRepository.count();
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
