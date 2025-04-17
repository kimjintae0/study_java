package 연산;

public class 삼항연산자 {
	public static void main(String[] args) {
		
		// 조건 ? 참일 때 : 거짓일때 		
		// 설명 >  물음표 왼쪽의 조건이 참이면 : 왼쪽 
//									거짓이면 : 오른쪽
		
		int x = 3;
		int y = 5;
		int max = ( x > y ) ? x : y ; //결과 5
		
		System.out.println(max);
		
		
	}
}
