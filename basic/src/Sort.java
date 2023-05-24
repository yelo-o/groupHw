public class Sort {
	public void printArray(int[] arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	void swap(int []arr, int source, int target) {
		int tmp = arr[source];
		arr[source] = arr[target];
		arr[target] = tmp;
	}

}
