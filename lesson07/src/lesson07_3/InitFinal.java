package lesson07_3; 

public class InitFinal {
	// 초기화 순서 > 메모리 올라가는 순서
	// 1. 클래스 변수
	// 2. 클래스 초기화블럭
	// 3. 인스턴스 변수
	// 4. 인스턴스 초기화블럭
	// 5. 생성사
	
	static int si =1; // static 붙으면 클래스
	int i =2;
	static void sm() {
		System.out.println(si);
//		System.out.println(i); // 호출 불가능 - 초기화 안된 변수 / this는 인스턴스 그 자체
//		System.out.println(this); // 호출 불가
	}
	void m() {
		System.out.println(si);
		System.out.println(i);
		System.out.println(this);
	}
	public static void main(String[] args) {
		InitFinal.sm();
		new InitFinal().m();
		
	}
	
	// 인스턴스 쓰는 이유 변수값 바꾸려고
	// 클래스 메서드 안에서 
}






