package lessson06;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int [] lotto = new int[6];
		int idx =0;
		while (true) {
			int number = (int)(Math.random()* 45 + 1) ;
			
			Boolean insert = true;
			
			for (int i=0; i<= idx ; i++) {
				if(lotto[i] == number) {
					insert = false ; // 여기서 false > 추가한다
					break; //for break
				}
			}
			if (insert) {
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6) break ; // while break
		}
		int[] arr = lotto;
		for(int i = 0 ; i < arr.length - 1 ; i ++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length - 1 - i ; j ++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr [j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		int[] arr2 = {5,4,2,3,1};
//		Arrays.sort(arr2, (a, b) -> b - a);;
//		System.out.println(Arrays.toString(arr2)); / 이렇게해도 결과값은 같음
	}
}

