package 클래스;

public class This {
	public static void main(String[] args) {
		Person person = new Person(null, 0);
		person.setName("철수");
		System.out.println(person.name);
	}
	
}

//	This : 자기 자신 (인스턴스 / 지역 변수 구분)
//
//	This.인스턴스변수;

