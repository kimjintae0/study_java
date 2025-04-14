package lesson01;

public class EscapeEx {
	
	public static void main(String[] args) {
		String greet = "안녕하세요,\n저는 \"홍길동\"입니다."; //쌍따옴표,홑따옴표 앞에는 \ 붙어야함
		String greet2 = "\t반갑습니다.";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		
		int i =10;
		{
			
			System.out.println(i);
			double d = 10;
			//System.out.println(d); // 정수를 넣고 출력해도 실수로 자동 행변환 해줌	
		}
		
		
		// short > 2 byte
		// char > 2 byte
		long l = 10;
		i = (int)l;
		
		byte b = (byte)128;
		
		System.out.println("123456789123456789123456789123456789123456789");
		System.out.println(Integer.toBinaryString(300));
		System.out.println((byte)300);
		
	}
}
