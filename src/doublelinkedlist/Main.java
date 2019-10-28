package doublelinkedlist;

public class Main {

	public static void main(String[] args) {
		Employee ishwar = new Employee("Ishwar", "K", 21);
		Employee sristy = new Employee("Sristy", "A", 24);
		Employee divya = new Employee("Divya", "S", 20);
		Employee jeevitha = new Employee("Jeevitha", "R", 20);
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		System.out.println("Is linked List empty : " + employeeLinkedList.isEmpty());
		employeeLinkedList.addFront(ishwar);
		employeeLinkedList.print();
		employeeLinkedList.addFront(divya);
		employeeLinkedList.addFront(sristy);
		employeeLinkedList.addTail(jeevitha);
		employeeLinkedList.print();
		System.out.println();
		System.out.println("\nSize : " + employeeLinkedList.getSize());
		EmployeeNode removedNode = employeeLinkedList.removeFromFront();
		System.out.println(removedNode);
		employeeLinkedList.print();
		System.out.println();
		EmployeeNode removedNode2 = employeeLinkedList.removeFromTail();
		System.out.println(removedNode2);
		employeeLinkedList.print();
	}

}
