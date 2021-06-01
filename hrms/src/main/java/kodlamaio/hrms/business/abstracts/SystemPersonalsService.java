package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.SystemPersonals;

public interface SystemPersonalsService {
 void add(SystemPersonals systemPersonals);
 void delete(int id);
 List<SystemPersonals> getAll();
 
 
	
}
