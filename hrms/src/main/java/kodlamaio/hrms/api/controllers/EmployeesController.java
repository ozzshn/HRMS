package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.entities.concretes.Employees;
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
private EmployeesService employeesService;
@Autowired
public EmployeesController(EmployeesService employeesService) {
	super();
	this.employeesService = employeesService;
}
@GetMapping("/getall")	
public List<Employees> getAll(){
	return employeesService.getAll();
}

}
