package linkedlist;

public class Main {

	public static void main(String[] args) {
		Employee ishwar = new Employee("Ishwar", "K", 21);
		Employee sristy = new Employee("Sristy", "A", 24);
		Employee divya = new Employee("Divya", "S", 20);
		Employee jeevitha = new Employee("Jeevitha", "R", 20);
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		System.out.println("Is linked List empty : " + employeeLinkedList.isEmpty());
		employeeLinkedList.add(ishwar);
		employeeLinkedList.print();
		employeeLinkedList.add(jeevitha);
		employeeLinkedList.add(divya);
		employeeLinkedList.add(sristy);
		employeeLinkedList.print();
		System.out.println("\nSize : " + employeeLinkedList.getSize());
		EmployeeNode removedNode = employeeLinkedList.remove();
		System.out.println(removedNode.employee);
		employeeLinkedList.print();
	}

}
