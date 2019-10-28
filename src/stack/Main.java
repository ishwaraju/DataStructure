package stack;

public class Main {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		Employee ishwar = new Employee("Ishwar", "K", 21);
		Employee sristy = new Employee("Sristy", "A", 24);
		Employee divya = new Employee("Divya", "S", 20);
		Employee jeevitha = new Employee("Jeevitha", "R", 20);
		stack.push(jeevitha);
		stack.push(divya);
		stack.push(ishwar);
		stack.push(divya);
		stack.push(sristy);
		stack.print();

	}

}
