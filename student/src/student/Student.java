package student;

// Data class
public class Student {
	// 1. studentMain의 나머지 기능 구현(메세지 출력)
	// 2. student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의필드를 다 사용)
	
	// 3. 학생 1인의 총점, 평균을 계산 한다면?
	//    > 학생 한명에 대해서 등록하게 되면 service 보다 student 에서 하는게 맞음
	// 4. 어떻게 처리 할건지?
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
//	int total = kor+eng+mat; // > x 총점이라는 메서드를 만들어어야함 int total() {
	
	Student() {} // 기본 생성자
	
	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	int total() {
		return kor+eng+mat;
	}
	
	double avg() {
		return (kor+eng+mat) / 3; 
		
	}
}

// 25.04.16
// 1. 평균 계산 double type //  service 수정 및 삭제 구현



// =============================== 메모
//Student(String n){
//	name = n;
//}

//Student(String n, int no){
//	name = n;
//	this.no = no;
//}
