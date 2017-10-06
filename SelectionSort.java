
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {2, 8, 9, 4, 1, 6, 7, 3, 5};
		selectionSort(arr);
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
	/* Described: Select minimum and swap it up
	 * Best Time: T(n) = O(n^2)
	 * WorstTime: T(n) = O(n^2)
	 * Average  : T(n) = O(n^2)
	 */
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
