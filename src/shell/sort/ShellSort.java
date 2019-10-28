package shell.sort;

public class ShellSort {

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

	public static void sort(int[] array) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int newElement = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > newElement) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = newElement;
			}
		}
	}

}
