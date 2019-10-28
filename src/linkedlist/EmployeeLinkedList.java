package linkedlist;

public class EmployeeLinkedList {
	EmployeeNode head;
	private int size;

	public void add(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setNext(head);
		head = employeeNode;
		size = getSize() + 1;
	}

	public EmployeeNode remove() {
		if (isEmpty())
			return null;
		else {
			EmployeeNode employeeNode = head;
			head = head.getNext();
			size--;
			employeeNode.setNext(null);
			return employeeNode;
		}

	}

	public void print() {
		System.out.print("\nHEAD-> ");
		EmployeeNode current = head;
		while (current != null) {
			System.out.print(current);
			System.out.print("->");
			current = current.getNext();
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}
	
	
}
