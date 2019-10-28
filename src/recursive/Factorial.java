package recursive;

public class Factorial {
	public static int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	public static void main(String[] args) {
		int i = 0;
		int factorialValue = factorial(i);
		System.out.println(factorialValue);
	}
}
