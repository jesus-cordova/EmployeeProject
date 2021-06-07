
public class Employee {

	int empNo;
	String empName;
	double salary;
	Address address;

	public Employee(int empNo, String empName, double salary, Address address) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public int getEmployeeNo() {
		return empNo;
	}

	public void setEmployeeNo(int empN) {
		empNo = empN;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empNa) {
		empName = empNa;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double s) {
		salary = s;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address a)
	{
		 address = a;
	}
	public String toString()
	{
		return "Employee number: " + empNo + " Employee Name: " +  empName + " Salary: " +  salary + " Adress :" + address;
	}
	
	public boolean equals(Object o) {
		  if (!(o instanceof Employee)) {
		    return false;
		  }
		  Employee other = (Employee) o;
		  return empNo == other.empNo && empName.equals(other.empName) && salary == other.salary && address.equals(other.address);
		}

}
