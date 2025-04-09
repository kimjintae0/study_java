package lesson04;

public class OpEx3 {
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 10 ;
		
		++a; // 전위연산
		b++; // 후위연산
		
		System.out.println(++a); // 먼저 더해지고 변수값이 나옴 
		System.out.println(b++); // b를 먼저 출력하고 ++ 더해짐
		
	}
}
