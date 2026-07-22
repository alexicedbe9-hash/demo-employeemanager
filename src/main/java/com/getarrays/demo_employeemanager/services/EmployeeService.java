package com.getarrays.demo_employeemanager.services;

import com.getarrays.demo_employeemanager.exceptions.UserNotFoundException;
import com.getarrays.demo_employeemanager.model.Employee;
import com.getarrays.demo_employeemanager.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    /**
     * Service d'ajout d'un nouvel employe
     * @param employee : l'employe
     * @return l'employé sauvegardé
     */
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    /**
     * Retourne tous les employés
     * @return la liste de tous les employés
     */
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    /**
     * TODO
     * @param employee
     * @return
     */
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    /**
     * TODO
     * @param id
     * @return
     */
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeBy(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    /**
     * TODO
     * @param id
     */
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
}
