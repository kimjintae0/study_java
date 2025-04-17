package lesson01;


public class HelloWorld {
	
	public static void main(String [] args) {		
	      // main ctrl + space
			System.out.println("Hello World"); // Ctrl + F11 출력
			/* camel 표기 lastIndexOf, parseInt 등..
	여러줄 주석 * snake 표기 student_number
			 */ 
			// 한줄 주석 
			   
			String name = "김진태";
			System.out.println(name);
			System.out.println(name.lastIndexOf("태"));
			
	

	    	 
		String name1; // 변수 선언
		name1 = "홍길동"; // 변수 초기화
		String name2 = "홍길동"; // 선언과 동시에 초기화
		String name3 = null;   // null값으로 초기화
		String name4 = " ";     // ""값으로 초기화 
	
		System.out.println("name2="+name2);
		System.out.println("name3="+name3);
		System.out.println("name4="+name4);
	}
}
