package 연산;

public class 대입연산자 {
	public static void main(String[] args) {
		
//		= 오른쪽에 있는 값 또는 식을 왼쪽에 있는 변수에 대입
				int num = 10; // 결과 10
				System.out.println(num);
				num = num + 2; // 결과 12
				System.out.println(num);
				num = num - 2; // 결과 10
				System.out.println(num);
				
//		+= (왼쪽 + 오른쪽) 결과를 왼쪽에 대입
				num += 2; // 결과 12
				System.out.println(num);
//		-= (왼쪽 - 오른쪽) 결과를 왼쪽에 대입
				num -= 2; // 결과 10
				System.out.println(num);
//		*= (왼쪽 - 오른쪽) 결과를 왼쪽에 대입
				num *= 2; // 결과 20
				System.out.println(num);
//		/= (왼쪽 - 오른쪽) 결과를 왼쪽에 대입
				num /= 2; // 결과 10
				System.out.println(num);
//		%= (왼쪽 - 오른쪽) 결과를 왼쪽에 대입
				num %= 2; // 결과 0
				System.out.println(num);
	}		
}
