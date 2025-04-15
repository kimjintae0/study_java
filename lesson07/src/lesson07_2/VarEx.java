package lesson07_2;

public class VarEx { // 필드 1

	public static void main(String[] args) {
		
		// 클래스 변수 사용
		System.out.println("Avante 제조사 : " + Avante.company); // Avante의 컴퍼니
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		// 인스턴스 변수의 값 변경
		a1.color = "화이트";
		a2.color = "블랙";
		
		// 인스턴스 변수 출력
		System.out.println("a1 색상 : " +a1.color);
		System.out.println("a1 색상 : " +a2.color); // Avante.color 이런식으로는 안됨
		
		// 클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : " + a1.company);
		System.out.println("a2 제조사 : " + a1.company);
		
		// 클래스 변수의 값 변경
		a1.company = "기아";
	
		// 클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		System.out.println("Avante 제조사 : " + Avante.company); // >> 해당 클래스가 공유할 공간
		System.out.println("a1 제조사 : " + a1.company);
		System.out.println("a1 제조사 : " + a2.company);
		
	}
	
	
}

class Avante { // 필드 2
	String color; // 인스턴스 변수
	static String company = "현대"; // 클래스 변수
}