import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

@Test
	public void testGetSalary() {
		Employee emp = new Employee(23, "Michael", 23.00, new Address("Texas", "El Paso"));
		double salary = emp.getSalary();
		assertEquals(23.00,salary );
	}
}
