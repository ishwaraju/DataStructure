package doublelinkedlist;

public class EmployeeLinkedList {
	EmployeeNode head;
	EmployeeNode tail;
	private int size;

	public void addFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if (head == null)
			tail = node;
		else {
			head.setPrev(node);
			node.setNext(head);
		}
		head = node;
		size = getSize() + 1;
	}

	public void addTail(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null)
			head = node;
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;
		size = getSize() + 1;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty())
			return null;
		EmployeeNode employeeNode = head;
		if (head.getNext() == null)
			tail = null;
		else {
			head.getNext().setPrev(null);
		}
		head = head.getNext();
		size--;
		employeeNode.setNext(null);
		return employeeNode;
	}

	public EmployeeNode removeFromTail() {
		if (isEmpty())
			return null;
		EmployeeNode employeeNode = tail;
		if (tail.getPrev() == null)
			head = null;
		else {
			tail.getPrev().setNext(null);
		}
		tail = tail.getPrev();
		size--;
		employeeNode.setPrev(null);
		return employeeNode;
	}

	public void print() {
		System.out.print("\nHEAD-> ");
		EmployeeNode current = head;
		while (current != null) {
			System.out.print(current);
			System.out.print("<->");
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
