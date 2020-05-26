/**
 * This method will sort the array with Time Complexity O(n). Condition:- All
 * values of the array should be less than equals to length of the array.
 */
public class MininumSwaps {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 1, 5 };
		int count = sort(arr);
		System.out.println("\n" + "Mininum Swaps: " + count);

	}

	private static int sort(int[] arr) {
		int i = 0;
		int count = 0;

		while (i < arr.length) {
			if (arr[i] != i + 1) {

				while (arr[i] != i + 1) {
					int temp = arr[arr[i] - 1];
					arr[arr[i] - 1] = arr[i];
					arr[i] = temp;
					count++;

					System.out.println("Swap");

				}

			}
			i++;
			System.out.println("Skip");
		}
		printArray(arr);
		return count;

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
