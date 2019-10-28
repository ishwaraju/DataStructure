package insertion.sort;

public class InsertionSort {

	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		int array[] = { 20, 4, 90, 8 };
		System.out.println("Before sorting");
		print(array);
		System.out.println("\nAfter sorting");
		sort(array);
		print(array);

	}

	private static void sort(int[] array) {

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int i;
			int newElement = array[firstUnsortedIndex];
			for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}
			array[i] = newElement;
		}

	}

}
