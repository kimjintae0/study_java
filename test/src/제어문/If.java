package 제어문;

public class If {
	public static void main(String[] args) {
		
		int num = 3;
		if (num > 0)
			System.out.println("num은 0보다 커요");
		
		if (num < 0)
			System.out.println("num은 0보다 작아요"); // 실행 x
		
		if(num > 0 && num < 5)
			System.out.println("num은 0보다 크고 5보다 작아요");
		
		if(num > 0 || num < 5)
			System.out.println("num은 0보다 크거나 5보다 작아요");
		
		// >> if 조건에 따른 분기를 위해 사용
		//조건 한가지
		//if(조건)
//			명령문
		//
		//조건 여러개
		//if(조건) {
//			명령문1
//			명령문2...
		//}
		
	}
}

	