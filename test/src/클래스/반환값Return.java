package 클래스;

public class 반환값Return {
	
	public static int getMaxLottoNumber() {
		return 45;
	}
	
	public static void main(String[] args) {
		int num = getMaxLottoNumber();
		System.out.println(num); // 45
	}
}

//	반환값(return) : 메소드 실행 결과를 반환
//	
//	접근제어자 반환형 메소드명() {
//		명령문1
//		명령문2
//		...
//		return 반환값;
//	}

