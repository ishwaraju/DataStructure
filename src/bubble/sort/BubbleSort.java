package bubble.sort;

public class BubbleSort {
	public static void sort(int array[]) {
		int unsortedIndex = array.length - 1;
		for (int i = unsortedIndex; i>0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j])
					swap(array, i, j);
			}
		}
	}

	public static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i]+" " );
	}

	public static void main(String[] args) {
		int array[] = { 20, 4, 90, 8 };
		System.out.println("Before sorting");
		print(array);
		System.out.println("Afetr sorting");
		sort(array);
		print(array);

	}

}
