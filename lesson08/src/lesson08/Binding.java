package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj);
		System.out.println(obj.si);
		System.out.println(obj.i);
		obj.sm();
		obj.m();
		
		/////////////////////////
		A a = new A();
		B b = new B();
		
		A c = b; // 허용 가능한 이유 A에 타입에 b들어감 / 조상타입 상속관계
		System.out.println(c);
		B d = (B)a; // 자식 타입의 변수를 조상타입에 강제로 넣을수가 없음 / 문법적으로 문제 없지만 에러남
//		
		B e = (B)c; // 강제 형변환 개념
		System.out.println(e);
		
	}
}

class A {
	static int si = 1;
	int i = 2;
	static void sm () {System.out.println("A.sm()");}
	void m() {System.out.println("A.m()");}
}
class B extends A{
	static int si = 3;
	int i = 4;
	static void sm () {System.out.println("B.sm()");}
	void m() {System.out.println("B.m()");}
}

// 선언된 방식
// 동적 오버라이딩 
// 빨간색 오류 나는건 컴파일러 시점





