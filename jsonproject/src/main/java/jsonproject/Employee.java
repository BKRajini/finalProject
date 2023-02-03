package jsonproject;

public class Employee 
{
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	private EmployeeDTO employeeDTO;
	
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}

	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeDTO=" + employeeDTO + "]";
	}
	

	


}
