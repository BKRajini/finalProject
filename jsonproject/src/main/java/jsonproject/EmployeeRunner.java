package jsonproject;

public class EmployeeRunner {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Employee");
		System.out.println("12");
		// System.out.println(employee);
		EmployeeDTO emplo = new EmployeeDTO();
        emplo.setName("EmmaWatson");
		emplo.setSalary(5000);
		emplo.setMarried(false);

		employee.setEmployeeDTO(emplo);

		System.out.println(employee.toString());
	}
}
