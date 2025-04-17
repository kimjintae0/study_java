package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		
//		new child().print();
//		child child = new child();
//		Class cls = SuperEx.class; >> 클래스 리터럴 이라고함 1주뒤에 배움 > 클래스를 클래스화 시킨거
//		Child.class.newInstance(); >> 이렇게 사용하는 방식 리플랙션 기능 > 프로젝트를 자동으로 만드는... 코드 자동 생성기 같은거 어려운 개념
		
	}
}

//생성자 문제 내 첫줄은 반드시! 호출해야됨 / extends 클래스가 없음 
// class Parent extends object 생략됨 / extends object 생략됨
//오브젝트 생략 시 자동으로 오브젝트 / 오브젝트 개념은 언젠가 쓰인다
class Parent extends Object { 
	int number = 3; // 주석 처리 시 에러 > 좋은 예제
	
	Parent() {
		super();
		System.out.println("부모 객체 생성");
	}
	
}


class child extends Parent { //생성자 문제 내 첫줄은 반드시! 호출해야됨
	int number = 2;
	
	child() {
		super(); // 컴파일러가 추가 
		System.out.println("자식 객체 생성");
		
	}
	
	void print() {
		int number = 1; // 주석 처리 시 조금 더 가까운 
		System.out.println(number); // 메서드 지역변수 number
		System.out.println(this.number); // 자신 객체의 number
		System.out.println(super.number); // 부모 객체의 number
		
	}
}

// 산술 연산 시 리터럴값은 안담음 
// 인스턴스는 객체의 리터럴 > 숫자로 바로 계산했다고 이해







