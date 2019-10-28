package selection.sort;

public class SelectionSort {
	public static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

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
		for (int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--) {
			int minimum = 0;
			for (int i = 0; i <= unsortedIndex; i++) {
				if (array[minimum] < array[i])
					minimum = i;
			}
			swap(array, minimum, unsortedIndex);
		}
	}

}
