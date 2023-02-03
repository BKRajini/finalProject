package javatojson;

public class JavaToJSON 
{
 private String employeeName;
 private int employeeId;
 private String employeeAge;
 private long phoneNum;
 private int salary;
@Override
public String toString() {
	return "JavaToJSON [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeAge=" + employeeAge
			+ ", phoneNum=" + phoneNum + ", salary=" + salary + "]";
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(String employeeAge) {
	this.employeeAge = employeeAge;
}
public long getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 
 
}
