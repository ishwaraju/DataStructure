package linkedlist;

public class EmployeeNode {
	EmployeeNode next;
	Employee employee;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String toString() {
		return employee.toString();
	}

}
