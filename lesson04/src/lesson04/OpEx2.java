package lesson04;

public class OpEx2 {

	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = " + a); // 10출력
		int b = a - 5;
		System.out.println("10 - 5 = " + b); // 5출력
		int c = b * 2;
		System.out.println("5 * 2 = " + c); // 10출력
		int d = c / 5;
		System.out.println("10 / 5 = " + d); // 2출력
		
		//나머지 연산
		int e = 10 % 3; // 10 나누기 3의 결과값은 몫이 3, 나머지 1
		System.out.println("10 % 3 = " + e);
		
		// 산술연산
		// int보다 작은 타입들, byte, short, char 
		
		char ch1 = 'A';
		ch1 = (char)(ch1 + 1); // ch1 = ch1 + 1 ; >> 해당 식으로 변경 시 결과값으로 B가 나올거
		
		ch1++; // > ++ 한개씩 증가
		System.out.println(ch1);
		
		// quiz /소수점 둘째자리까지 절삭 / 연산자,형변화 사용
		double val = 1.234567;
	
		System.out.println(val * 100);
		
		// 100을 곱해라.
		val = val * 100; // 123.4567
		// 정수로 만들어라
		val = (int)val; // 123.0
		// 100으로 나눠라
		val = val / 100;
		
	}
}





