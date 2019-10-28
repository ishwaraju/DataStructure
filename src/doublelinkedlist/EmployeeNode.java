package doublelinkedlist;

public class EmployeeNode {
	private EmployeeNode next;
	private Employee employee;
	private EmployeeNode prev;

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

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	public String toString() {
		return employee.toString();
	}

}
