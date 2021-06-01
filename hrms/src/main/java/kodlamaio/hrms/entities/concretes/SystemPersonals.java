package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="systemPersonals")
@Entity

public class SystemPersonals {
	@Id
	@GeneratedValue
	@Column(name="id")	
    private int id;
	@Column(name="firstName")	
    private String firstName;
	@Column(name="lastName")	
    private String lastName;

public SystemPersonals() {
	
}

public SystemPersonals(int id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}
}
