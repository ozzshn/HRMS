package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployersService employersService;
   @Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
   @GetMapping("/getall")	
   public List<Employer> getAll(){
   	return employersService.getAll();
   }
}
