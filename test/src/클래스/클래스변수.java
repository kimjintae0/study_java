package 클래스;

public class 클래스변수 {
	public static void main(String[] args) {
		Person.personCount = 10; //  클래스 변수: 객체를 만들 필요 없이 클래스 명으로 접근 / person. 누르면 확인됨
		System.out.println(Person.personCount); // 10
		
	}

//	public class Person {
//		String name;
//		int age;
//		static int personCount = 0; // 클래스 변수
//}
	
}

//	클래스 변수 : 클래스 내에 static 으로 선언된 변수 > 모든 객체가 공유하는 변수


//	class 클래스명{
//		static 클래스 변수1
//		static 클래스 변수2
//		...
//	}




