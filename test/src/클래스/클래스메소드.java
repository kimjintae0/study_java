package 클래스;

public class 클래스메소드 {
		
	public static void main(String[] args) {
		Person.personCount = 10;
		Person.printPersonCount();
	}
	
}

//	클래스 메소드 : 클래스 내에 static 으로 정의된 메소드
//
//	class 클래스명 {
//		static 클래스 메소드1
//		static 클래스 메소드2
//		...
//	}

//	public class Person {
//		String name;					
//		int age;						
//	static int personCount = 0; 	
//	public static void printPersonCount() {		// 클래스 메소드
//		System.out.println(personCount);		// 클래스 메소드
//
//}
//}