package test;

public class LocalValEx {
	public static void main(String[] args) {
	
		// > 객체 생성
		Local local = new Local();	
		// > name 인스턴스 변수 출력
		System.out.println(local.name);	// null
		// > 인스턴스 변수가 클래스 블록에 있기 때문에 클래스 전체에서 사용
		local.process();
		System.out.println(local.name); // 홍길동
		
		local.printAge1();
		local.printAge2();
		
		// for문 블록 내에서의 (지역)변수 선언
		for (int i = 0; i < 10 ; i++) {
			int temp = 0;
			temp += i;
		}
	}
}

class Local{
	
	String name;
	
	void process() {
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20; //	지역변수
		System.out.println(age);
	}
	void printAge2() {
		int age = 30; //	지역변수
		System.out.println(age);
	}
	
	
}
