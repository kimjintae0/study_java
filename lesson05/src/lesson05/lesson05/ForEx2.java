package lesson05;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) { // 행번호 우클릭 토글 브레이크 포인트  
//현재의코드를 기반으로 3의배수의 합계 구하기  // f11 런 디버그 스위치 // f6(step over)누르면 한 단계씩 볼수있음 
		
//		int sum = 0;		
//		for(int i = 1  ; i <= 100 ; i ++) {
//			sum += i * 3;
//			System.out.printf("i : %3d, sum : %4d\n", i, sum);
//		}
//		System.out.println(sum);
		// 숫자를 입력받고(scanner를 쓰라는 뜻) 해당 숫자의 약수들을 출력
		// 12 
		// 1 2 3 4 6 12
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력");
		int input = scanner.nextInt(); // 6
		
		int i = 1 ;
		while(i <= input) {
			if(input % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}

	

