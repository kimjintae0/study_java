package lesson06_2;

public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}}; // 2차원 배열 / int 1차원 배열 / int 1차원 배열 묶이면 int 2차원 배열 
		                                           // arr[0]번째 배열은 {1,2,3}
		System.out.println(arr[1][0]);			   // 1번째 배열에서 0번째 인덱스 >> 4는 int 타입
												   // 배열은 참조 자료형
		String[][][] strs = {
				{}, { {"A", "B", "C"}, {"가", "나", "다"} }, { {"0", "1"} }
		};
		// strs.length
		// {}
		// { {"A", "B", "C"}, {"가", "나", "다"} }
		// { {"0", "1"} }
		
		System.out.println(strs.length);
		System.out.println(strs[1].length);
		System.out.println(strs[1][1].length);
		System.out.println(strs[1][1][1]);
	}
}
