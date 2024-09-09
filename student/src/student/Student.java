package student;

public class Student {
	
	//학생 예제> java beeans 명세서에 ㅁ맞게끔 수정
	//field는 private, method는 public
	public Student() {

	}
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public student() {}
	
	
	//생성자 정의
	
	public Student(int no, String name ,int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
		//no getter
	public int getNo() {
		return no;
		
	}
	//no setter
	public void setNo(int no) {
		return no;
	
	public int total() {
	return kor+ eng +mat;
	}
	
	public double avg() {
		return total() /3d;
		
	}
//	void Update() {
//		this.name = StudentUtils.nextLine("이름");
//		this.kor = StudentUtils.nextInt("국어 점수");
//		this.eng = StudentUtils.nextInt("영어 점수");
//		this.mat = StudentUtils.nextInt("수학 점수");
//		
//	}
}
