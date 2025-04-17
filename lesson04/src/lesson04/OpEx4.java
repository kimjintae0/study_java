package lesson04;

public class OpEx4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
//		System.out.println(a > b);
//		System.out.println(a >= b);
//		System.out.println(a < b);
//		System.out.println(a <= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
		
		boolean c = (a == b); // c = a=b랑 같냐
		System.out.println("c : " + c);
		boolean d = (c == false); // c 가 d랑 같냐
		System.out.println("d : " + d);
		
		//가힣 / a - z까지 어떻게 세는지 / 0 - 9까지 어떻게 세는지 
	
		
		System.out.println('9' - '0' + 1); // 힣 - 가
		
		
		// AND : 그리고, 교집합, 둘다 참일때만 참 / 나머지 전부 거짓
		// OR : 혹은, 합집합, 둘다 거짓일때만 거짓 / 나머지 전부 다 참
		
		// boolean e
		// a의 값이 양수 이면서 20보다 작은지
		
	//	boolean e = a > 0 && a < 20; // boolean e = 0 < a && a < 20; / boolean e = 0 < a < 20; 0이 먼저 계산되면서 논리값이 나옴  
		
		// a의 값이 홀수 이거나 5의 배수 인지를 e에 저장
//		e = a % 2 == 1 || a % 5 == 0; // boolean e = a % 1 && a % 5 > 내가 적은답  
		
		// 논리연산
		// 논리곱 && 논리합 || 논리부정 !
		
		// 비트연산
		// 비트곱 & 비트합 | 비트부정 ~ 비트배타합 ^ 
		
		System.out.println(9 & 5); // 이진수된 값을 바탕으로 나옴
		System.out.println(9 | 5);
		System.out.println(9 ^ 5);
		
		// 9 : 1001
		// 5 : 0101
		
		System.out.println(~0);
		
		// 1001
		// 9 << 2 : 1001 에서 100100 으로
		
		System.out.println(9 << 2);
		System.out.println(9 >> 2);
		
		System.out.println(-4 << 2);
		System.out.println(-4 >> 2);
		System.out.println(-4 >>> 2);
		
		System.out.println(Integer.toBinaryString(-4 >>> 2)); //완변하게 이해되지 않더라도 느낌만 알아가기 이런게 있구나 정도만
		
		// A + B = D
		// D / B = A
		
		
	}
}







