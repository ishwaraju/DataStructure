package stack;

public class ArrayStack {
	private Employee[] stack;
	private int top;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee employee) {
		if (top == stack.length) {
			System.out.println("Stack is full. Need to resive");
			Employee[] newArray = new Employee[(2 * stack.length)];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
		}
		stack[top++] = employee;
	}

	public Employee pop() {
		if (isEmpty())
			System.out.println("Stack is emopty");
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}

	public Employee peek() {
		if (isEmpty())
			System.out.println("Stack is empty");
		return stack[top - 1];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top;
	}

	public void print() {
		for (int i = 0; i < stack.length; i++)
			System.out.print(stack[i] + " -- ");
	}

}
