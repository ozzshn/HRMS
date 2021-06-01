package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemPersonalsService;
import kodlamaio.hrms.entities.concretes.SystemPersonals;
@RestController
@RequestMapping("/api/systemPersonals")

public class SystemPersonalsController {
private SystemPersonalsService systemPersonalsService;

@Autowired
public SystemPersonalsController(SystemPersonalsService systemPersonalsService) {
	super();
	this.systemPersonalsService = systemPersonalsService;
}
@GetMapping("/getall")	
public List<SystemPersonals> getAll(){
	return systemPersonalsService.getAll();
}
}
