
public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {2, 8, 9, 4, 1, 6, 7, 3, 5};
		mergerSort(arr);
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
	/* Described: Divide into two part and sort these two part
	 * Best Time: T(n) = O(n log n)
	 * WorstTime: T(n) = O(n log n)
	 * Average  : T(n) = O(n log n)
	 */
	
	//1: Set up temp array
	public static void mergerSort(int[] arr) {
		int[] temp = new int[arr.length];
		mergerSort(arr, temp, 0, arr.length-1);
	}
	
	//2: Find center + divide into two + sort and merge
	public static void mergerSort(int[] arr, int[] temp, int left, int right) {
		if(left < right) {
			int center = (left + right) / 2;
			mergerSort(arr, temp, left, center);
			mergerSort(arr, temp, center + 1, right);
			merge(arr, temp, left, center + 1, right);
		}
	}
	
	//3: Sort and merge two together
	public static void merge(int[] arr, int[] temp, int left, int right, int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(arr[left] <= arr[right])
				temp[k++] = arr[left++];
			else
				temp[k++] = arr[right++];
		}
		
        while(left <= leftEnd) {
			temp[k++] = arr[left++];
		}
		
		while(right <= rightEnd) {
			temp[k++] = arr[right++];
		}
		
		for(int i = 0; i < num; i++, rightEnd--) {
			arr[rightEnd] = temp[rightEnd];
		}
	}
	
	
}
