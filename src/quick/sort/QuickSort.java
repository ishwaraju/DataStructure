package quick.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Before Sorting :");
		print(array);
		quickSort(array, 0, array.length);
		System.out.println("\nAfter Sorting");
		print(array);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	private static void quickSort(int[] input, int start, int end) {
		if (end - start < 2)
			return;
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}

	private static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while (i < j) {
			// Note Empty loop Body
			while (i < j && input[--j] >= pivot);
			if (i < j)
				input[i] = input[j];
			// Not : empty loop Body
			while (i < j && input[++i] <= pivot);
			if (i < j)
				input[j] = input[i];

		}
		input[j] = pivot;
		return j;
	}
}
