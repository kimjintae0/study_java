package lesson04;

public class OpEx7 {
	public static void main(String[] args) {
		int score = 80;
		String pass = score >= 60? "합격" : "불합격"; // ? 기호는 삼항연산자에서 주로 사용
		System.out.println(pass);
		
		// (char)(-var) > 이런 경우 가까운거 먼저 
		
		// = >> 대입연산자
		// 복합 대입 연산자
		
		// += -= /= %= 
		String str = "";
		str += "추가되는 문자열\n";
		str += "추가되는 문자열\n";
		System.out.println(str);
		
		
	}
}
