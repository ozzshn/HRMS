package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Employees;

public interface EmployeesService {
void add(Employees employees);
void delete(int id);
List<Employees> getAll();

}
