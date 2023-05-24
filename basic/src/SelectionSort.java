public class SelectionSort extends Sort {
	void sort(int[] arr) {
		System.out.println("선택정렬 진행합니다");
		for(int i=0;i<arr.length;i++) {
			int indexMin = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[indexMin] > arr[j]) {
					indexMin=j;
				}
			}
			swap(arr,indexMin,i);
		}
	}
}
