package 연산;

public class 문자열비교 {
	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2); // false > 다른 곳을 참조 (!=)
		System.out.println(s1.equals(s2)); // true (문자열 내용이 같다)
		
//		String s1 = "Java";
//		String s2 = "Java";
//		System.out.println(s1 == s2); // true > 이렇게 쓰면 X
		
		
//   정수비교		
//		int num1 = 3;
//		int num2 = 3;
//		System.out.println(num1 == num2); // true / = 출력 시 3 나옴
	}
}
