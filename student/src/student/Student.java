package student;

// Data class
public class Student {
	// 1. studentMain의 나머지 기능 구현(메세지 출력)
	// 2. student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의필드를 다 사용)
	
	// 학생 1인의 총점, 평균을 계산 한다면?
	// 어떻게 처리 할건지?
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	Student(){
		
	}
	
	Student(int n){
		no = no;
	}

	Student(int n, String name){
		no = no;
		name = name;
	}
	
	Student(int n, String name, int kor){
		no = no;
		name = name;
		kor = kor;
	}
	Student(int n, String name, int kor, int eng){
		no = no;
		name = name;
		kor = kor;
		eng = eng;
	}
	Student(int n, String name, int kor, int eng, int mat){
		no = no;
		name = name;
		kor = kor;
		eng = eng;
		mat = mat;
	}
	
	
	
}

//Student(String n){
//	name = n;
//}

//Student(String n, int no){
//	name = n;
//	this.no = no;
//}
