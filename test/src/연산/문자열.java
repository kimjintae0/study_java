package 연산;

public class 문자열 {
	public static void main(String[] args) {
		String s = "I like Java";
		
//		length 길이 
		s.length(); // 결과 11
//		toUpperCase 대문자로
		s.toUpperCase(); // I LIKE JAVA
//		toLowerCase 소문자로
		s.toLowerCase(); // i like java
//		contains 포함 여부
		s.contains("Java"); // true
//		indexOf 위치 정보 
		s.indexOf("Java"); // 7
//		lastIndexOf 마지막 위치 정보
		s.lastIndexOf("a"); // 10
//		startWith 문자열로 시작하는가?
		s.startsWith("I like"); // true
//		endWith 문자열로 끝나는가 
		s.endsWith("."); // false
//		replace 문자열 변환
		s.replace("like", "love"); // I love Java
//		substring 문자열 자르기
		s.substring(7); // Java
//		trim 앞뒤 공백 제거 
		s.trim(); // I like Java
//		concat 문자열 결합
		s.concat(" and Python"); // I like Java and Python

		System.out.println(s.lastIndexOf("a"));
		
	}
}
