package 클래스;

public class 인스턴스변수 {

	public static void main(String[] args) {
		Person person = new Person(null, 0);
		person.name = "철수";
		person.age = 20;
		person.setName("철수");
		System.out.println(person.name);
//		person.introduce();
	}
	
//	class Person {
//		String name;	// 인스턴스 변수
//		int age;		// 인스턴스 변수
//	}
	
}

//인스턴스 변수 : 클래스 내에 선언된 변수
//
//	class 클래스명 {
//		인스턴스 변수1
//		인스턴스 변수2
//		...
//}

