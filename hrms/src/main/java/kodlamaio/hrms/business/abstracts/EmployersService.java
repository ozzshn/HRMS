package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployersService {
void add(Employer employer);
void delete(int id);
List<Employer> getAll();
}
