package recursive;

public class FibonaciSeries {
	public static int fibonaci(int i) {
		if (i <= 1)
			return i;
		return fibonaci(i - 1) + fibonaci(i - 2);
	}

	public static void main(String[] args) {
		int i = 9;
		int fibonaciValues = fibonaci(i);
		System.out.println(fibonaciValues);
	}
}
