package lesson01;

import java.io.PrintStream;
import java.util.Arrays;

public class CharType {
	public static void main(String[] args) {
		// 문자 65000개 가량
		// 한글의 비중이 많음
		
		char 문자 = '가'; // 가 다음은 각 > 이런식으로 진행 
		System.out.println(문자);
		
		int 정수화된문자 = 문자;
		System.out.println(정수화된문자);
		
		String str = "가" + "나" + "다라마"; // 가나다라마
		System.out.println(str);
		
		char a = 'A'; // 문자 변수 a = 대문자 A
		// syso 입력 후 ctrl + space
		System.out.println("a : "+ a); // 콘솔에 출력하기 위한 구문 // 문자열과 결합해서 + 나옴
		
		int b = a; // 65 숫자에 대한 정수값을 출력
		System.out.println("b : "+ b);
		
		char c = 66; // 66 정수값에 대한 문자를 출력
		System.out.println("c : "+ c);
		
		int d = a+b; // A + A = 65 + 65 = 130
		System.out.println("d : "+ d);
	}
}
