package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {
		int result = add(10,20);
		System.out.println(result);
		print("Hello"); // 스택
		System.out.println(addAll(1, 2, 3));	
		// Stack
		return;
	}
	static int add(int a, int b) {
		// int a; 안에서 같이 선언하면 중복됨
		return a + b;
	}
	
	static int addAll(int... nums) { // ... 붙이면 인수의 제한이 없음 / nums 배열처럼 사용됨
		int ret = 0;
		for(int n : nums) {
			ret += n;
		}
		return 0;
		
	}
	
	static void print(String s) {
		System.out.println(s);
	}
}

// p.161~167까지 요약 나머지 예제 해보면서 이해하기

