package 클래스;

public class 전달값과반환값 {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int result = add(1, 2);
		System.out.println("1 + 2 = " + result);
	}
}

//	전달값과 반환값 : 전달값과 반환값이 있는 경우
//	
//	접근제어자 반환형 메소드명(전달값) {
//		명령문1
//		명령문2
//		...
//		return 반환값;
//	}