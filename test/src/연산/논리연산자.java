package 연산;

public class 논리연산자 {
	public static void main(String[] args) {
		//&& 왼쪽과 오른쪽이 모두 참인가? 
		//		(5>3) && (3>1) // true
		//!! 왼쪽 또는 오른쪽이 하나라도 참인가?
		//		(5>3) || (3<1) // true
		//! (참 또는 거짓)의 반대 
		//		!(5 == 5) // false
		
		System.out.println((5>3)&&(3>1));
	}
}
