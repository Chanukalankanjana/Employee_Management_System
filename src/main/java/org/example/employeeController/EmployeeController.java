package org.example.employeeController;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.service.EmployeeService;
import org.example.service.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
//http://localhost:8080/emp-controller/add-employee
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeServiceImpl service;
    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee){
        service.AddEmployee(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll(){
        return service.getAll();
    }

}
