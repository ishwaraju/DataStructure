package counting.sort;

public class CountingSort {

	public static void main(String[] args) {
		int[] array = { 2, 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		System.out.println("Before sorting");
		print(array);
		System.out.println("\nAfter sorting");
		countSort(array, 1, 10);
		print(array);

	}

	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void countSort(int[] input, int min, int max) {
		int[] countArray = new int[max - min + 1];
		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}
		int j = 0;
		for (int i = min; i < max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}

	}

}
