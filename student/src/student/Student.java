package student;

public class Student {
	public Student() {

	}
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	
	//생성자 정의
	
	public Student(int no, String name ,int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	int total() {
	return kor+ eng +mat;
	}
	
	double avg() {
		return total() /3d;
		
	}
}
