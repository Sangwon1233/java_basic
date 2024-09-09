package student;
import static student.StudentUtils.*;

import java.util.Arrays;
import java.util.Scanner;

//Logic
public class StudentService {
	Student[] students = new Student[5];
	int cnt;
	
	
	{
		students[cnt++]=new Student(1,"새똥이",80,90,100);
		students[cnt++]=new Student(2,"개똥이",77,66,77);

		
	}
	//학생 등록
	void add() {
		
		
//		if(students.length==cnt) {//studnet 길이가 cnt랑 같으면
//		students = Arrays.copyOf(students, (cnt)*2);//배열 길이를 증가시킨다
//		}
//		students[cnt++]=StudentUtils.add1();//studentUtils에 있는 add1를 소환
		//students를 추가할때 필요한것
//		students[cnt].name=StudentUtils.nextLine("이름을 입력하세요");
//		students[cnt].kor=StudentUtils.nextInt("국어을 입력하세요");
//		students[cnt].eng=StudentUtils.nextInt("영어을 입력하세요");
//		students[cnt].mat=StudentUtils.nextInt("수학을 입력하세요");
//		
		
			
	}	
	//학생 목록 조회
	void list() {
	//	System.out.println(list());
		System.out.println("학번 이름 국어 영어 수학 총점 평균");
		System.out.println("==============================");
		for(int i=0;i<cnt;i++) {
		//	if(students[i].no==-1) {//제거에서 학번이 -1이면 출력을 밑에껄 안하고 위에껄 한다
			//	continue; //계속인데 if의 범위가 밑에 printf를 담고있지 않아서 출력x 
			}
		System.out.printf("%4d %4s %6d %7d %7d %7d %5.2f\n",
					students[i].no,
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].mat,
					students[i].total(),
					students[i].avg()
			);
			
		
	 }
		
		
}
	//학생 이름, 점수 수정
	void modify() {
//		int mno = StudentUtils.nextInt("수정 할 학번 입력하세요.>");//mno에 수정할 번호 입력
//		int i;
//		for(i=0;i<students.length;i++) {
//			if(students[i].no==mno) {// mno가 student가 같을때 수정 
//				break;
//				
//			}
//		}
//		students[i].Update();
		
	}
	//학생 삭제
	void remove() {
//		int rno = StudentUtils.nextInt("삭제 할 학번 입력하세요.>"); //삭제할 학번을 idx에 입력
//		int i;
//		for(i=0;i<students.length;i++) {
//			if(students[i].no==rno) {//같으면 학번 삭제 실행
//				students[i].no=-1; //원래 있던 정보를 안보이게 함
//				break;
//				
//			}
//		}
//			
	}
}

