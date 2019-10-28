package radix.sort;

public class RadixSort {

	public static void main(String[] args) {
		int[] array = { 4725, 4586, 1330, 8792, 1594, 5729 };
		System.out.println("Before Sorting :");
		print(array);
		radixSort(array, 10, 4);
		System.out.println("\nAfter Sorting");
		print(array);

	}

	private static void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}

	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int itemLength = input.length;
		int[] countArray = new int[radix];
		for (int value : input) {
			countArray[getDigit(position, value, radix)]++;
		}
		// Adjust the count Array
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		int[] temp = new int[itemLength];
		for (int tempIndex = itemLength - 1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}

		for (int tempIndex = 0; tempIndex < itemLength; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(10, position) % radix;
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
