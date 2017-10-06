
public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {2, 8, 9, 4, 1, 6, 7, 3, 5};
		quickSort(arr, 0, arr.length-1);
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
	/* Description: Use the pivot point and move the element <= pivot to left and >= pivot to right
	 * Best Time: T(n) = O(n log n)
	 * WorstTime: T(n) = O(n^2)
	 * Average  : T(n) = O(n log n)
	 */
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right)
			return;
		
		int pivot = arr[(left + right)/2];
		int index = partition(arr, left, right, pivot);
		quickSort(arr, left, index - 1);
		quickSort(arr, index, right);
	}
	
	public static int partition(int[] arr, int left, int right, int pivot) {
		while(left <= right) {
			while(arr[left] < pivot) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
}
