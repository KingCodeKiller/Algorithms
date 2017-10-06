
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {2, 8, 9, 4, 1, 6, 7, 3, 5};
		insertionSort(arr);
		printOut(arr);
	}
	
	public static void printOut(int[] arr) {
		for(int x : arr) {
			System.out.print(x + ",");
		}
	}
	
	/*-----------------------------------------------------------------------------*/
	/*                            Sorting Algorithm                                */
	/*-----------------------------------------------------------------------------*/
	/* Described: Insert smaller element and move others back
	 * Best Time: T(n) = O(n^2)
	 * WorstTime: T(n) = O(n^2)
	 * Average  : T(n) = O(n^2)
	 */
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int index = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > index) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = index;
		}
	}
}
