package 배열;

public class 다차원배열 {
	public static void main(String[] args) {
		
		int[][] number = new int[2][5];
		number[0][2] = 3; //>> (0,2) 자리에 3 들어간다고 이해
//		(0,0)(0,1)(0,2)(0,3)(0,4)
//		(1,0)(1,1)(1,2)(1,3)(1,4)
		System.out.println(number[0][2]);
		
		int[][] numbers = new int[][] { // 선언과 동시에 초기화 가능
			{1,2,3},
			{4,5,6},
			{7,8,9}	
		};
		System.out.println(numbers[2][2]);
		

//		다차원 배열 : 2차원 이상의 배열
//		자료형[][] 변수형 = new 자료형[세로][가로]; / > 세로줄, 가로줄로 이해 // >> 0행,0열 시작으로 일단 이해
		
	}
}




