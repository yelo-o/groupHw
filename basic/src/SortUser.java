public class SortUser {
	public static void main(String[] args) {
		// TODO 버블정렬, 선택정렬 수행
		
		int[] arr = {3,5,4,2,1}; //배열 초기화
		BubbleSort b1 = new BubbleSort(); //버블정렬 인스턴스 생성
		b1.printArray(arr); // 초기화된 배열 출력
		b1.sort(arr); // 버블 정렬 수행
		b1.printArray(arr); // 정렬된 배열 출력
		
		System.out.println("===================");
		
		arr = new int[] {3,5,4,2,1} ; //배열 초기화(선택 정렬 수행 위해) 
		SelectionSort b2 = new SelectionSort(); //선택정렬 인스턴스 생성
		b2.printArray(arr);
		b2.sort(arr); // 초기화한 배열 선택정렬로 정렬
		b2.printArray(arr);
	}
}
