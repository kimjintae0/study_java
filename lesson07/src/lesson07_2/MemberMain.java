package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {
		// this 미래에 생성될 객체의 주소값
		Member m = new Member(20); // new Member(20); 먼저 처리 후 Member m 처리
		System.out.println(m.num);
		System.out.println(m);
		Member member = m.m1();
		System.out.println(member);
		m.m2(m);
	}
}
class Member {
	int num = 10; // 필드 /인스턴스 변수
	Member(int num){
		this.num = num; // 생성자
	}
	Member m1() {
		return this; // 메서드 
	}
	void m2(Member m) { // 내 클래스 타입과 같음
		System.out.println(m);
	}
}