package 클래스;

public class Person {
	String name;					
	int age;						
	static int personCount = 0; 	
	public static void printPersonCount() {
		System.out.println(personCount);
	}
	public void setName(String name) {
		this.name = name;
	}
	Person(String name, int age){
		this.name = name;	// 초기화 작업
		this.age = age;		// 초기화 작업
	}
}

//	class Person {
//		String name;	// 인스턴스 변수
//		int age;		// 인스턴스 변수
//	}

//	static int personCount = 0; // 클래스 변수

//	public void introduce() {					// 인스턴스 메소드
//		System.out.println("이름 : " + name);	// 인스턴스 메소드
//		System.out.println("나이 : " + age);	// 인스턴스 메소드

//public static void printPersonCount() {		// 클래스 메소드
//	System.out.println(personCount);			// 클래스 메소드
//}


