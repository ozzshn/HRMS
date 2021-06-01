package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UsersService;
import kodlamaio.hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")

public class UsersController {
	
private UsersService usersService;

@Autowired
public UsersController(UsersService usersService) {
	super();
	this.usersService = usersService;
}


@GetMapping("/getall")	
public List<Users> getAll(){
	return usersService.getAll();
}
}
