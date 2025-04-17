package 변수와자료형;

public class 형변환 {
	public static void main(String[] args) {
		int score = 93; // 실수로 변환?
		float score_f = (float) score; // 변수명
		double score_d = (double) 93; // 값
		System.out.println(score_d);

//		int score = 93; 
//		float score_f = score; // (float)
//		double score_d = 93; // (double) 생략 가능 
	
//		int > long > float > double
//		: 묵시적 형 변환 (= 자동 형 변환) 
//		컴파일러가 자동으로 형 변환 해줌
		
//		double score_d = 98.8;
//		int score = (int)score_d; // (int) 생략 불가능
//		double > float > long > int
//		: 명시적 형 변환
	}
}
