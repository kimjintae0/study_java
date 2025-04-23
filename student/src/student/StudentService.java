package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService { 
//	1. 학생 예제 내의 정렬을 List의 sort로 구현, Comparator 사용
//	2. Map을 사용한 문자 빈도수 계산
	
	
	private List<Student> students = new ArrayList<Student>(); // {null,null,null,null,null,null,null,null,null,null}  > 이렇게 10개 들어있다고 생각
	private	List<Student> sortedStudents = new ArrayList<Student>();
	
			
	{
		students.add(new Student(1, "개똥이", randomScore(), randomScore(), randomScore())); 
		students.add(new Student(2, "새똥이", randomScore(), randomScore() ,randomScore()));
		students.add(new Student(3, "말똥이", randomScore(), randomScore() ,randomScore()));
		students.add(new Student(4, "소똥이", randomScore(), randomScore() ,randomScore()));
		
		sortedStudents = new ArrayList<Student>(students);
		rank();
		
	}
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}

	
		// 입력 : 학번
		// 출력 : 학생
	public Student findBy(int no) {
		Student student = null;
		for(int i = 0 ; i < students.size()	; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}
	
	public int checkRange(String subject, int input, int start, int end) {
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다. " + start + "~" + end + "사이의 입력을 해주세요");
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}
	
	public String inputName() {
		String name = StudentUtils.nextLine("이름 > ");
		if(!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 2~4글자로 구성되어야합니다");
		}
		return name;
	}
	
	// 등록
		public void register() {
			System.out.println("등록 가능"); 
		// > 등록기능 구현 ui쪽 x	 // 학생 인스턴스를 생성하고 
		// 학생 생성
		// 학번, 이름, 국어, 영어 ,수학
			int no = StudentUtils.nextInt("학번 > ");
		
			Student s = findBy(no);
		
			if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
				return;
			}
		
			//int no = StudentUtils.nextInt("학번 > ");
			String name = inputName();
			
			int kor = StudentUtils.nextInt("국어 > ");
			checkRange("국어", kor);
			
			
			int eng = StudentUtils.nextInt("영어 > ");
			checkRange("영어", eng);
			
			int mat = StudentUtils.nextInt("수학 > ");
			checkRange("수학", mat);
			Student s2 = new Student(no, name, kor, eng, mat);
			students.add(s2);
			sortedStudents.add(s2);
			rank();
		}
	
	// 조회 // > 반복해야됨
		public void read() {
			System.out.println("조회 가능");
			print(students);
		
//		for (int i = 0 ; i < count ; i ++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total()+ ", " + students[i].avg());
		}
		
		public void readOrder() {
			System.out.println("석차순 조회 기능");
			print(sortedStudents);
		}
		
		public void print(List<Student> stu) {
			stu.forEach(s -> System.out.println(s)); // 람다식 컴슈머 개념 들어감
			}
		
		
//		 double avg =  (kor += eng += mat);
//		for (int i = 0 ; i < count ; i ++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].avg());
//		}

	
	// 수정		 
		public void modify() {
			System.out.println("수정 기능");
			// 학생들 배열에서 입력받은 학번과 일치하는 학생 // 수정은 있을때만 등록은 없을때만..
			int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
			Student s = findBy(no);
			
				if(s == null) {
					System.out.println("입력된 학번이 존재하지 않습니다.");
					return;
				}
			
			String name = inputName();
			s.setName(name);
			s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > ")));
			s.setEng(checkRange("영어", StudentUtils.nextInt("영어 > ")));
			s.setMat(checkRange("수학", StudentUtils.nextInt("수학 > ")));
			rank();	
		}

	// 삭제   // arraycopy, 
		public void remove() {
		System.out.println("삭제 가능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		students.remove(s);
		sortedStudents.remove(s);
//		rank(); // 생략 가능
	}
	
		public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		students.stream().map(s->s.getKor());	
			
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		// count
		int size = students.size();
		for(int i = 0 ; i < size ; i++) {
			avgKor += students.get(i).getKor(); 
			avgEng += students.get(i).getEng(); 
			avgMat += students.get(i).getMat(); 
		}
		avgKor /= (double)size;
		avgEng /= (double)size;
		avgMat /= (double)size;
		
		avgAll = (avgKor + avgEng + avgMat) / 3; 
		
		System.out.println(size + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);
		
	}
	
		public void rank() {
		
				for(int i = 0 ; i <  sortedStudents.size() - 1; i++ ) {
					int idx = i;
					for(int j = 1 + i ; j < students.size() ; j++) {
						if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
							idx = j;
						}
					}
					Student tmp = sortedStudents.get(i);
					sortedStudents.set(i, sortedStudents.get(idx));
					sortedStudents.set(idx, tmp);
				}
	
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int idx = 0;
//		System.arraycopy(arr, idx+1, arr, idx, arr.length - 1 - idx);
//		System.out.println(Arrays.toString(arr));
	}
	
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

// 25.04.18
// 1. 모든 필드, 메서드, 생성자 > 접근제한자
// 1-1. 필드 private, 메서드 public, 생성자 public
// 1-2. getter, setter
// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
// 3. 점수값 입력의 범위 0~100 사이만 인정
// 4. 이름 입력은 한글만 인정, 2글자~4글자사이
// 5. 임시데이터의 점수값을 랜덤으로 배정(60~100)

// 도형 과제 추가
// 삼각형, 3차원도형 추가 구현
// 25.04.22
// 1. 학생예제의 배열 > 리스트로 교체
// 2. 이름 유효성을 정규표현식으로 교체


