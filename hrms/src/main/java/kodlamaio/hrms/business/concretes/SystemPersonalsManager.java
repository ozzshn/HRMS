package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemPersonalsService;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonalsDao;
import kodlamaio.hrms.entities.concretes.SystemPersonals;
@Service
public class SystemPersonalsManager implements SystemPersonalsService {

	private SystemPersonalsDao systemPersonalsDao;
	
	@Autowired
	public SystemPersonalsManager(SystemPersonalsDao systemPersonalsDao) {
		super();
		this.systemPersonalsDao = systemPersonalsDao;
	}
	
	@Override
	public void add(SystemPersonals systemPersonals) {
	 	systemPersonalsDao.save(systemPersonals);
	}

	@Override
	public void delete(int id) {
        systemPersonalsDao.deleteById(id);		
	}

	@Override
	public List<SystemPersonals> getAll() {

		return this.systemPersonalsDao.findAll();
	}

}
