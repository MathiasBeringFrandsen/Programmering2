package architecture1Semester.storage;

import java.io.Serializable;
import java.util.ArrayList;

import architecture1Semester.application.model.Company;
import architecture1Semester.application.model.Employee;

public class Storage implements Serializable {
	private static Storage storage;

	private ArrayList<Company> companies = new ArrayList<>();
	private ArrayList<Employee> employees = new ArrayList<>();

	private Storage(){}

	public static Storage getInstance(){
		if (storage == null) {
			storage = new Storage();
		}
		return storage;
	}
	// -------------------------------------------------------------------------

	public ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	public void addCompany(Company company) {
		companies.add(company);
	}

	public void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------

}
