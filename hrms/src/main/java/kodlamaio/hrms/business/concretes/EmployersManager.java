package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;
	@Autowired
	private EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public void add(Employer employer) {
     employersDao.save(employer);		
	}

	@Override
	public void delete(int id) {
     employersDao.deleteById(id);	
	}

	@Override
	public List<Employer> getAll() {
		return this.employersDao.findAll();
	}

}
