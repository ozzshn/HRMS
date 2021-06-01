package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemPersonals;


public interface SystemPersonalsDao extends JpaRepository <SystemPersonals,Integer> {

}
