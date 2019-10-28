package recursive;

//calcaulate x to the power of y
public class Power {
	public static int power(int x, int y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int powerValue = power(x, y);
		System.out.println(powerValue);
	}

}
