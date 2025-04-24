package student;

// Data class
public class Student {
	// 클래스 내에 선언할 위치
	// 1. 필드
	// 2. 생성자
	// 3. getter / setter
	// 4. 추가적인 메서드
	
	// 1. studentMain의 나머지 기능 구현(메세지 출력)
	// 2. student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의필드를 다 사용)
	
	// 3. 학생 1인의 총점, 평균을 계산 한다면?
	//    > 학생 한명에 대해서 등록하게 되면 service 보다 student 에서 하는게 맞음
	// 4. 어떻게 처리 할건지?
	
	private	int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
//	int total = kor+eng+mat; // > x 총점이라는 메서드를 만들어어야함 int total() {
	
	public Student() {} // 기본 생성자
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	
	// 
	// no, name, kor, eng, mat
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	public void setNo(int no) {
		this.no	= no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	public int total() {
		return kor+eng+mat;
	}
	
	public double avg() {
		return total() / 3d;		// return (kor+eng+mat) / 3d; > d 붙여서 정수로 바꿔야함  
		
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
	}
	
//	@Override
//	public int compareTo(Student o) {
//		return name.compareTo(o.name);
//	}
//	
	public static Builder builder(){
		return new Builder();
	}
	static class Builder{
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor(int kor) {
			this.kor = kor;
			return this;
			}
		
		public Builder eng(int eng) {
			this.eng = eng;
			return this;
		}
		
		public Builder mat(int mat) {
			this.mat = mat;
			return this;
		}
		public Student build() {
			return new Student(this);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
	public static void main(String[] args) {
		Student student = Student.builder().no(1).name("새똥이").kor(90).build();
		System.out.println(student);
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












