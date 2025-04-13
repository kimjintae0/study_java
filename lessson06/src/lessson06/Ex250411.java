package lessson06;

import java.util.Iterator;

public class Ex250411 {
	public static void main(String[] args) {
		// 1.문제 187000원 >> 배열사용
		// 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		 int[] units = {50000, 10000, 5000, 1000};
		 int[] count = new int[units.length];
		
		 // 이하 코드 작성 후 갯수 출력
		 
		 // String
		 // 2.문제 임의의 문자열 생성, CAPTCHA(캡차) 생성
		 // 문자열의 범위는 숫자, 영대, 영소 10글자
		 
		 // 3. 배열에 임의값(랜덤) 채우기
		 // 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		 // [0, 1, 1, 1, 3, 2, 1, 1, 3, 2, ....]
		 
		 // 3-2. 빈도수 구하기 > 3 결과를 바탕으로
		 // 배열의 길이는 10(0~9)
		 
		
		 // 교재 연습문제 111p ~ 113p
//		 // 1번 문제
		 
//		 int sum = 0 ;
//		 // for문을 이용하여 반복 합계 연산
//		 for (int i = 0; i <= 100 ; i++) {
//			 if(i % 5 == 0) sum += i ; // if(i % 5 == 0) 답지 참고함
//			
//		}
//		 System.out.println("5의 배수의 합계는 "+sum);
		
		 // 2번 문제
		 
//		 int evenSum = 0 ;
//		 int oddSum = 0 ;
//		
//		 for (int i = 1; i <= 100 ; i++) {
//			if(i % 2 == 0 ) evenSum += i ;
//			}
//		 	for (int i = 1; i <= 100 ; i++) {
//		 		if(i % 2 == 1) oddSum += i ;
//		}
//		 System.out.println("짝수의 합계는 "+evenSum);
//		 System.out.println("홀수의 합계는 "+oddSum);
		 
		 // 3번 문제
		 
//		 for (int x = 1; x <= 6 ; x++) {
//			for (int y = 1; y <= 6 ; y++) {
//				if (x + y == 6) 
//					System.out.println("(" + x + "," + y + ")"); 
//									// "(" + x + "," + y + ")" 해설 참고함
//			}
//		}
		 	
		 // 4번 문제
//		 for (int i = 1; i <= 5 ; i++) {
//			 for (int j = 1; j <= i ; j++) {
//				System.out.print("*");
//			}
//			 System.out.println(""); // 해설 참고함
//		}
		  
		 // 5번 문제
//		 for (int i = 5; i >= 1 ; i--) {
//		 for (int j = 1; j <= i ; j++) {
//			System.out.print("*");
//		}
//		 System.out.println(""); // 해설 참고함
//	}		 
		 // 6번 문제
		 for (int i = 1; i <= 10 ; i++) {
		 for (int j = 1; j <= i ; j++) {
			 if(i % 2 == 1)
			 System.out.print("*");
		}
		 System.out.println(""); // 해설 참고함
	}		 
		 // 7번 문제
		 
	}
}



