public class BubbleSort extends Sort {
	void sort(int[] arr) {
		System.out.println("버블정렬 진행합니다");
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1] > arr[j]) {
					swap(arr,(j-1),j);
				}
			}
		}
	}
}
