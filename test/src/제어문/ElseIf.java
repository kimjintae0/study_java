package 제어문;

public class ElseIf {
	public static void main(String[] args) {
		
		int num = 3;
		if (num < 3)
			System.out.println("num은 3보다 작아요"); // 실행 x
		else if(num > 3) {
			System.out.println("num은 3보다 커요"); // 실행 x
		}
		else if(num == 3) {
			System.out.println("num은 3과 같아요"); // 실행 ㅇ
		}
		
//		else if : 다른 조건 추가
//
//		조건 한가지
//
//		if(조건1)
//			명령문
//		else if(조건2)
//			명령문
//		. . .
//
//		조건 여러개
//
//		if(조건1)
//			명령문
//		else if(조건2) {
//			명령문. . .
//		else if(조건3) {
//			명령문. . .
//		} else {
//		    명령문
//		}
	
	}
}


