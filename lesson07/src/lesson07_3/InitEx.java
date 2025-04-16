package lesson07_3;

public class InitEx {
	
	// 생성자
	InitEx(){
		System.out.println("생성자 호출");
	}
	
	// static 초기화 블럭   //클래스는 메모리 로드 후 호출 / 프로그램이 끝나기 전까지 계속 살아있음 > 프로그램 끝나야 반납 
	static { // static 붙으면 클래스
		System.out.println("클래스 초기화 블럭 실행"); // 클래스 int 블록 = 클래스 초기화 블럭 실행
	}
	
	{
		System.out.println("인스턴스 초기화 블럭 실행"); // 
	}
	
	
	public static void main(String[] args) {
		System.out.println("main 메서드시작");
		System.out.println("main init1 객체 생성");
		InitEx init1 = new InitEx(); // 인스턴스 변수가 생성 > 아무도 찾지 않을때 사라짐 = 인스턴스 참조값이 없을때  
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx(); //  InitEx init1 =  생략 가능 
		System.gc(); // jvm 가비지
		

		
//		System.out.println("main 메서드시작");
//		System.out.println("main init1 객체 생성");
//		new InitEx();
//		System.out.println("main init2 객체 생성");
//		new InitEx();
		
		
	}
	
}








