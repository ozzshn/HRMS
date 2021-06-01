package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employer;


public interface EmployersDao extends JpaRepository <Employer,Integer>{

}
