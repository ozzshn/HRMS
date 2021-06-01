package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService {

	private EmployeesDao employeesDao;
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public void add(Employees employees) {
      employeesDao.save(employees);		
	}

	@Override
	public void delete(int id) {
      employeesDao.deleteById(id);		
	}

	@Override
	public List<Employees> getAll() {
		return this.employeesDao.findAll();
	}

}
