import java.util.Scanner;

public class UseEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeServicelmpl employees = new EmployeeServicelmpl();
		employees.init();
		int selection = 0;
		int selectEmpNo = 0;
		Employee selectedEmployee;
//		employees.displayAllEmployees();
//		System.out.println(employees.calculateYearlySalary(new Employee(1, "Josh", 10.00, new Address("SLC","Utah"))));
//		System.out.println(employees.findByEmployeeNo(2));
//		employees.updateEmployee(new Employee(1, "Josh", 10.00, new Address("SLC","Utah")));
//		employees.displayAllEmployees();
//		employees.deleteEmployee(new Employee(1, "Josh", 10.00, new Address("SLC","Utah")));
//		employees.displayAllEmployees();
		do {
			promptSelectionMenu();
			selection = scanner.nextInt();
			switch (selection) {
			case 1:
				employees.displayAllEmployees();
				break;
			case 2:
				System.out.println("Please enter an employee number to see their salary");
				selectEmpNo = scanner.nextInt();
				selectedEmployee = employees.findByEmployeeNo(selectEmpNo);
				employees.calculateYearlySalary(selectedEmployee);
				System.out.println(selectedEmployee.salary);
				break;
			case 3:
				System.out.println("Please enter an employee number to see their details");
				selectEmpNo = scanner.nextInt();
				selectedEmployee = employees.findByEmployeeNo(selectEmpNo);
				System.out.println(selectedEmployee);
				break;
			case 4:
				System.out.println("Please enter an employee number that you wish to update");
				selectEmpNo = scanner.nextInt();
				selectedEmployee = employees.findByEmployeeNo(selectEmpNo);
				employees.updateEmployee(selectedEmployee);
				break;
			case 5:
				System.out.println("Please enter an employee number that you wish to delete");
				selectEmpNo = scanner.nextInt();
				selectedEmployee = employees.findByEmployeeNo(selectEmpNo);
				employees.deleteEmployee(selectedEmployee);
				break;
			case 6:
				break;
			}
				scanner.nextLine();
		} while (selection != 6);
	}

	public static void promptSelectionMenu() {
		System.out.printf(
				"\nPlease select an option: \n1. List all employees\n2. Display yearly salary\n3. Display a specific employee\n4. Modify employee details\n5. Delete an Employee\n6. Quit\n");
	}
}
