import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServicelmpl implements EmployeeService {
	Scanner myScanner = new Scanner(System.in);
	public static ArrayList<Employee> allEmployees = new ArrayList<Employee>();
	
	public void init() 
	{
		
	allEmployees.add(new Employee(1, "Josh", 10.00, new Address("SLC","Utah")));
	allEmployees.add(new Employee(2, "Matt", 20.00, new Address("wvc","Utah")));
	allEmployees.add(new Employee(3, "Bert", 30.00, new Address("Draper","Utah")));
	allEmployees.add(new Employee(4, "Marty", 40.00, new Address("Bountiful","Utah")));
	allEmployees.add(new Employee(5, "Felipe", 50.00, new Address("Taylorsville","Utah")));
	}
	public void displayAllEmployees() {
		
		allEmployees.forEach(emp -> System.out.println(emp));
	}

	public double calculateYearlySalary(Employee em) {
		for (Employee el : allEmployees) {
			if (el.equals(em))
				return el.salary;
		}
		System.out.println("this employe is not under our list");
		return -1;
	}

	public Employee findByEmployeeNo(int empNo) {

		for (Employee el : allEmployees) {
			if (el.empNo == empNo)
				return el;
		}
		System.out.println("this employe is not under our list");
		return null;
	}

	public void updateEmployee(Employee em) {
		if (allEmployees.indexOf(em) != -1) {
			System.out.println(
					"what field would you like to update \n 1.Empoloyee Number \n 2.Employee Name \n 3.Salary \n 4.Address");
			int selection = myScanner.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Please enter the new employee number");
				int newEmpNo = myScanner.nextInt();
				allEmployees.get(allEmployees.indexOf(em)).setEmployeeNo(newEmpNo);
				System.out.println("Sucessfully updated");
				break;

			case 2:
				System.out.println("Please enter the new employee name");
				String newEmpName = myScanner.next();
				allEmployees.get(allEmployees.indexOf(em)).setEmpName(newEmpName);
				System.out.println("Sucessfully updated");
				break;
			case 3:
				System.out.println("Please enter the new employee salary");
				double newSalary = myScanner.nextDouble();
				allEmployees.get(allEmployees.indexOf(em)).setSalary(newSalary);
				System.out.println("Sucessfully updated");
				break;
			case 4:
				System.out.println("Please enter the new employee state");
				String newState = myScanner.next();
				System.out.println("Please enter the new employee city");
				String newCity = myScanner.next();
				allEmployees.get(allEmployees.indexOf(em)).setAddress(new Address(newState, newCity));
				System.out.println("Sucessfully updated");
				break;
			}
		}
	}

	public void deleteEmployee(Employee em) {
		if (allEmployees.remove(em))
			System.out.println("Successufllly removed");
		else
			System.out.println("not removed");
	}
}
