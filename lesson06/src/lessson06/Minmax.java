package lessson06;

import java.util.Arrays;

public class Minmax {
	public static void main(String[] args) {
		int[] arr = {10, 1, 3, 5, 6};
		// 최대값, 최소값 구하기
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 :: " + max);
		System.out.println("최소값 :: " + min);
		// 합계, 평균
	//	for (int i)
	//	int[] arr = 
	//	System.out.println(Arrays.toString(arr));
		
		
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / arr.length);
	}
}
