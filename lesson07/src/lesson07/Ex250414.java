package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		// 1. 피보나치 수열 출력 > 반복문 변수의 특징 
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
		// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
		// 1 1 2 3 4 5 13 21 44 65 109 ...

//		int a = 1;
//		int b = 0;
//		for (int i = 0; i < 20 ; i++) {
//			int c = a + b ;
//			System.out.println(c + " ");
//			a = b; // 1
//			b = c; // 2
//		}
		
//		1 1 2
//		  1 2 3
//		    2 3 5
//		
		

		
			
		// 2. 50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성 (새 배열을 추가해라)
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 3 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] tmp = new int[3];
		System.out.println(Arrays.toString(tmp));
		int length = 0 ;
				
		for (int n : arr) {
			boolean insert = true;
			for (int i = 0; i < length ; i++) {
				if(n == tmp[i]) {
					insert = false;
					break;
				}
			}
			if(insert) {
				tmp[length++] = n;			
			}
		}
		System.out.println(Arrays.toString(tmp));
		Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
		/* 1번 문제 > 로또 문제 복습필요! > 이해하기가 조금 더 쉬움
		
		// 3. 2차원 배열
		/*
		 *  **
		 *  **
		 *  **
		 *  *****
		 *  *****
		 *        */
		char[][] chs = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		// 90도 시계 방향 회의 결과를 result2에 담으시오.
		
		char[][] result2 = new char[5][5];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs[i].length; j++) {
				System.out.print(chs[i][j] + " ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		}
		
		for(char[] t : result2) {
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0]; // 1
		result[1][2] = val[0][1]; // 2
		result[2][2] = val[0][2]; // 3
		
		result[0][1] = val[1][0]; // 4
		result[1][1] = val[1][1]; // 5
		result[2][1] = val[1][2]; // 6

		result[0][0] = val[2][0]; // 7
		result[1][0] = val[2][1]; // 8
		result[2][0] = val[2][2]; // 9
		
		
		
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 
		 * 7 4 1
		 * 8 5 2
		 * 9 6 3
		 */
		
		
	
//		=======================================
//		배열 복사부터 중요해짐
//
//		3일 뒤 JVM 배움
//		main.지역변수
//
//		참조자료형의 대한 이해 > 객체지향의 시작
//
//		4.25 금요일까지 자바 끝
//
//		향상된 for 문
//		당분간 인덱스 for문만 잘 이용해도 됨
//
//		참조자료형
//		arr. , name. 컨트롤 스페이스 누르면 나오는거 
//
//		int age = x;
//		age.  > 컨트롤 스페이스 누르면 안나옴 
//
//		배열의 단점 
//
//		배열은 엑셀 열의 개념
//		클래스는 행이라는 느낌으로 이해하기
//
//		클래스 = 설계도
//		객체 = 피조물
//
//		f(n)=f(n-1)+f(n-2)
	
	}
}
