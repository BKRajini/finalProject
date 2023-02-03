package jsonproject;

import java.io.Serializable;

public class EmployeeDTO implements Serializable
{
	 //* { "Employee": { "name": "Emma Watson", "salary": 40000, "married": false } }

 private String name;
 private int salary;
 private boolean married;

 public EmployeeDTO()
 {
	 System.out.println("This is Default constructor");
 }

@Override
public String toString() {
	return "EmployeeDTO [name=" + name + ", salary=" + salary + ", married=" + married + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public boolean isMarried() {
	return married;
}

public void setMarried(boolean married) {
	this.married = married;
}
 

 
}
