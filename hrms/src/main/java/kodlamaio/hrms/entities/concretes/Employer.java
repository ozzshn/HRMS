package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employers")
@Data
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="id")		
    private int id;
	@Column(name="companyName")	
    private String companyName;
	@Column(name="webAdress")	
    private String webAdress;
	@Column(name="phoneNumber")	
    private String phoneNumber;
	@Column(name="webMail")	
    private String webMail;
	@Column(name="password")	
    private String password;
	
public Employer() {
	
}
public Employer(int id, String companyName, String webAdress, String phoneNumber, String webMail, String password) {
	super();
	this.id = id;
	this.companyName = companyName;
	this.webAdress = webAdress;
	this.phoneNumber = phoneNumber;
	this.webMail = webMail;
	this.password = password;
}

}
