package 클래스;

public class 메소드오버로딩 {
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) { // 말 그대로 함수를 오버 로딩 한다고 이해
		return a + b + c;
	}
	public static double add(double a, double b) { // 말 그대로 함수를 오버 로딩 한다고 이해
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add(5.3, 3.8));
		
	}
	
}

//	메소드 오버로딩 : 같은 이름, 다른 매개변수  
//
//	접근 제어자 반환형 메소드명(정수 전달값) { }
//	
//	접근 제어자 반환형 메소드명(정수 전달값1, 정수 전달값2) { }
//	
//	접근 제어자 반환형 메소드명(실수 전달값) { }
//	
//	...