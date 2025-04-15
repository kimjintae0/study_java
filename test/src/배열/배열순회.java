package 배열;

public class 배열순회 {
	public static void main(String[] args) {
//		배열 순회 : 반복문을 이용한 배열의 각 요소 접근
//	
//		방법 1.
//		for (int i = 0; i < 배열.length; i++) {
//			... // 배열[i]
//		}
		
//		int[] numbers = {1, 2, 3, 4, 5};
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
//		방법 2.
//		for (int i : 배열) {
//			...//i
//		}	
		
		int[] numbers = {1,2,3,4,5};
		
//		for (int i : numbers1) {
//			System.out.println(i); // 복잡해지면 i 확인이 어려울수 있어서
//		}
		for (int number : numbers) {
			System.out.println(number); // 이런식으로 많이 사용
		}

		
	}
}





