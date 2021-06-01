package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="employees")
@Data
public class Employees {
	@Id
	@GeneratedValue
	@Column(name="id")	
    private int id;
	
	@Column(name="firstName")
    private String firstName;
	
	@Column(name="lastName")
    private String lastName;
	
	@Column(name="identityNumber")
    private String identityNumber;
	
 	@Column(name="birthyear")
    private int birthyear;
 	
	@Column(name="email")
    private String email;
	
	@Column(name="password")
    private String password;

public Employees() {
	
}
public Employees(int id, String firstName, String lastName, String identityNumber, int birthyear, String email,
		String password) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.identityNumber = identityNumber;
	this.birthyear = birthyear;
	this.email = email;
	this.password = password;
}
}
