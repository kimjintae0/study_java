package 제어문;

public class SwitchCase {
	public static void main(String[] args) {

		int menu = 2; // 게임 메뉴 : 시작(1),설정(2)
		switch (menu) {
		case 1: System.out.println("시작");
			break;
		case 2: System.out.println("설정"); // 출력
			break; // break, default 는 생략 가능
		default: System.out.println("잘못된 메뉴");
		}
		
		//break, default 는 생략 시
		
//		int menu = 2; // 게임 메뉴 : 시작(1),설정(2)
//		switch (menu) {
//		case 1: System.out.println("시작");
//			
//		case 2: System.out.println("설정"); // 출력
//			 // break, default 는 생략 가능
//		}

		
//		SwitchCase : 케이스(경우)에 따른 분기 / if문이랑 비슷한데 다름
//
//		switch (조건) {
//			case 값1: 명령문
//				break;
//			case 값1: 명령문
//			break;
//			...
//			default: 명령문
//		}
	}
}





