package 제어문;

import java.util.Iterator;

public class 이중반복문 {
	public static void main(String[] args) {
	
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3 ; j++) {
				System.out.println("안녕?");
			}
		}
		
//		이중 반복문 : 반복문의 중첩
		
//			이중 반복문 실행 시
//			
//		for (int i = 0; i < 2; i++) {
//				명령문
//		}
//			1. i가 2보다 작다는 조건을 만족하는 동안 총 2회에 걸쳐 [명령문] 반복 실행
//			
//			for (int j = 0; j < 3 ; j++) {
//				System.out.println("안녕?");
//			}
//			2. j가 3보다 작다는 조건을 만족하는 동안 총 3회에 걸쳐 명령문 반복 실행
//			
//			 2회 * 3회 = 6회
			

	}
}

