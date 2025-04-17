package student;

import java.util.Arrays;

public class StudentService { 
	Student[] students = new Student[10]; 
	int count; // int count = 0; > 생략가능
	// {null,null,null,null,null,null,null,null,null,null}  > 이렇게 10개 들어있다고 생각
	{
		students[count++] = new Student(1, "개똥이", 90, 80, 90);
		students[count++] = new Student(2, "새똥이", 90, 80, 90);
	}
	// 25.04.16
	// 1. 평균 계산 double type 
	// 2. service 수정 및 삭제 구현 / 이름도 바꾸도 학점도 과목도 바꿀수 있어야.. / 이름,국어,영어,수학 받아서 덮어쓰기
	// 3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기 // Student[] students = new Student[10]; > Student[] students = new Student[2]; 이걸로 실행 시 터짐
	
	// 25.04.17
	// 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 + 총평균(평균값의 평균 = total를 인원수로 나눔)
	// 3. 석차 순 정렬(총점 고득점자부터 출력되어야함)
	// 4. student 클래스의 toString(p.316 참고) 재정의 > 학생이 가진 toString을 재정의 = 편의성을 위해서
	
	
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
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
		}
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
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생 // 수정은 있을때만 등록은 없을때만..
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
	}
	
	// 삭제   // arraycopy, 
	void remove() {
		System.out.println("삭제 가능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		for (int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				//count--;
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int idx = 0;
		System.arraycopy(arr, idx+1, arr, idx, arr.length - 1 - idx);
		System.out.println(Arrays.toString(arr));
	}
	
}







