
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {2, 8, 9, 4, 1, 6, 7, 3, 5};
		bubbleSort(arr);
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
	/* Described: Loop through and move the larger back
	 * Best Time: T(n) = O(n^2)
	 * WorstTime: T(n) = O(n^2)
	 * Average  : T(n) = O(n^2)
	 */
	
	public static void bubbleSort(int[] arr) {
		//Loop from back
		for(int i = arr.length - 1; i >= 0; i--) {
			//Loop from front and swap larger back
			for(int j = 1; j <= i; j++) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
