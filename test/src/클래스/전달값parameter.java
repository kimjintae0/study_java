package 클래스;

public class 전달값parameter {
	
//		public static void print() { // 전달값이 없는 메소드
//			System.out.println("안녕?");
			
		public static void print(int a) { // 전달값이 있는 메소드
			System.out.println(a);
		}
		
//		public static void main(String[] args) {
//			print(3);
//			print(10);
//		}
		
		
		public static void add(int a, int b) { // 전달값이 여러 개 있는 메소드
			System.out.println(a + b);
		}
		
		public static void main(String[] args) {
			add(1, 2); // 3
			add(3, 5); // 8
		
		}
}





//	전달값(parameter) : 메소드 호출 시 전달하는 값
//	
//	접근제어자 반환형 메소드명(전달값) {
//			명령문1
//			명령문2
//			...
//		}
		
		