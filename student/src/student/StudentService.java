//package student;
//import static student.StudentUtils.*;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
////Logic
//public class StudentService {
//	Student[] students = new Student[5];
//	int cnt;
//	
//	
//	{
//		students[cnt++]=new Student(1,"새똥이",80,90,100);
//		students[cnt++]=new Student(2,"개똥이",77,66,77);
//
//		
//	}
//	//학생 등록
//	void add() {
//		
//		
////		if(students.length==cnt) {//studnet 길이가 cnt랑 같으면
////		students = Arrays.copyOf(students, (cnt)*2);//배열 길이를 증가시킨다
////		}
////		students[cnt++]=StudentUtils.add1();//studentUtils에 있는 add1를 소환
//		//students를 추가할때 필요한것
////		students[cnt].name=StudentUtils.nextLine("이름을 입력하세요");
////		students[cnt].kor=StudentUtils.nextInt("국어을 입력하세요");
////		students[cnt].eng=StudentUtils.nextInt("영어을 입력하세요");
////		students[cnt].mat=StudentUtils.nextInt("수학을 입력하세요");	
////		
//		
//			
//	}	
//	//학생 목록 조회
//	void list() {
//	//	System.out.println(list());
//		System.out.println("학번 이름 국어 영어 수학 총점 평균");
//		System.out.println("==============================");
//		for(int i=0;i<cnt;i++) {
//		//	if(students[i].no==-1) {//제거에서 학번이 -1이면 출력을 밑에껄 안하고 위에껄 한다
//			//	continue; //계속인데 if의 범위가 밑에 printf를 담고있지 않아서 출력x 
//			}
//		System.out.printf("%4d %4s %6d %7d %7d %7d %5.2f\n",
//					students[i].no,
//					students[i].name,
//					students[i].kor,
//					students[i].eng,
//					students[i].mat,
//					students[i].total(),
//					students[i].avg()
//			);
//			
//		
//	 }
//		
//		
//}
//	//학생 이름, 점수 수정
//	void modify() {
////		int mno = StudentUtils.nextInt("수정 할 학번 입력하세요.>");//mno에 수정할 번호 입력
////		int i;
////		for(i=0;i<students.length;i++) {
////			if(students[i].no==mno) {// mno가 student가 같을때 수정 
////				break;
////				
////			}
////		}
////		students[i].Update();
//		
//	}
//	//학생 삭제
//	void remove() {
////		int rno = StudentUtils.nextInt("삭제 할 학번 입력하세요.>"); //삭제할 학번을 idx에 입력
////		int i;
////		for(i=0;i<students.length;i++) {
////			if(students[i].no==rno) {//같으면 학번 삭제 실행
////				students[i].no=-1; //원래 있던 정보를 안보이게 함
////				break;
////				
////			}
////		}
////			
//	}
//}
package student;
import static student.StudentUtils.*;

import java.util.Arrays;

import lesson11_Exception.RangeException;

//Logic
public class StudentService extends RangeException {
	private static int start;
	public StudentService() {
		super(start);
		// TODO Auto-generated constructor stub
	}

	private Student[] students = new Student[5];
	private int cnt;
	
	
	{
		// students = { '주소값' , '', ''}
		students[cnt++]=new Student(1,"새똥이",80,90,100);
		students[cnt++]=new Student(2,"개똥이",77,66,77);
		students[cnt++]=new Student(3,"새똥이",80,90,100);
		students[cnt++]=new Student(4,"개똥이",77,66,77);
		
		
	}
	//학생 등록
	public void add() {
		int num =100;
		if(num >=0 || num <=100) {
			throw new RangeException(0);
		}
			
		int no = nextInt("학번");
		String name = nextLine("이름");
		int kor = nextInt("국어");
		int eng = nextInt("영어");
		int mat = nextInt("수학");	
		if(cnt == students.length) {
			students = Arrays.copyOf(students, students.length *2);
		}
		students[cnt++]= new Student(no,name,kor,eng,mat);
		
		
		
		
		
		
//		students[cnt++]=new Student(1,"새똥이",80,90,100);
		
		
//		if(students.length == i) {
//		students=Arrays.copyOf(students, students.length *2);
//		System.out.println(students);
//	
//		}
	
		}
	
//	}	

	//학생 목록 조회
	void list() {
	//	System.out.println(list());
		System.out.println("학번 이름 국어 영어 수학 총점 평균");
		System.out.println("==============================");
		for(int i=0;i<cnt;i++) {
			System.out.println(students[i]);
		}
		System.out.println(Arrays.toString(students));
					
	}
	
	//학생 이름, 점수 수정
	void modify() {
		//1. 학번 입력
		//2. 학번을 통한 탐색(배열)>>학생
		Student student =findByNo();
		//3.이름 국어 영어 수학 점수 변경
		if(student == null) {
		System.out.println("입력한 학번은 존재하지 않습니다.");
		return;
		}
		student.setName(nextLine ("이름")); 
		student.setkor(nextInt("국어"));
		student.seteng(nextInt("영어"));
		student.setmat(nextInt("수학"));
	}
	//학생 삭제
	 void remove() {
		Student student = findByNo();
		//3.이름 국어 영어 수학 점수 변경
		if(student==null) {
			System.out.println("입력한 학번은 존재하지않습니다.");
			return;
		}
		for(int i =0; i<cnt; i++) {
			if(students[i] == student) {//i=1
				System.arraycopy(students, i+1, students, i, cnt-- -i -1);
				break;
			}
		}
		
	}
	private Student findByNo() {
		Student student = null;
		
		int no = nextInt("학번");
		for(int i=0; i<cnt;i++) {
			if(students[i].getNo()==no) {
				student =students[i];
			}
		}
		return student;
	}
}
//이름은 반드시 한글, 이름 입력 안하는것도 문제, 이름 최소2 최대4글자의 한글
//점수의 범위 0~100
//학번 중복 불허
//1.학번 오름차순 2.이름 오름차순 3.점수 내림차순
//중간에 오류상황 발생 시 정지 되지 않게하기