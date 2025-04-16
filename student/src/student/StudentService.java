package student;

public class StudentService { 
	Student[] students = new Student[10]; 
	int count; // int count = 0; > 생략가능
	// {null,null,null,null,null,null,null,null,null,null}  > 이렇게 10개 들어있다고 생각
	
	// 25.04.16
	// 1. 평균 계산 double type 
	// 2. service 수정 및 삭제 구현 / 이름도 바꾸도 학점도 과목도 바꿀수 있어야.. / 이름,국어,영어,수학 받아서 덮어쓰기
	// 3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기 // Student[] students = new Student[10]; > Student[] students = new Student[2]; 이걸로 실행 시 터짐
	
	
	// 등록
	void register() {
		System.out.println("등록 가능"); 
		// > 등록기능 구현 ui쪽 x	 // 학생 인스턴스를 생성하고 
		// 학생 생성
		// 학번, 이름, 국어, 영어 ,수학
		int no = StudentUtils.nextInt("학번 > ");
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	
	// 조회 // > 반복해야됨
	void read() {
		System.out.println("조회 가능");
		for (int i = 0 ; i < count ; i ++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total()+ ", " + students[i].avg());
		}
		
//		 double avg =  (kor += eng += mat);
//		for (int i = 0 ; i < count ; i ++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].avg());
//		}
		
	}
	
	// 수정
	void modify() {
		System.out.println("수정 가능");
		
		
	}
	
	// 삭제
	void remove() {
		System.out.println("삭제 가능");
		
	}
}


