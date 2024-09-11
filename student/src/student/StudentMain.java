package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI 계속 루프가 돈다 예전 은행같은 느낌
		//Create Read Update Delete = CRUD 데이터를 다룰때 사용한다
		//CAR배열 =학생 배열 
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		
		while(true) {
			int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			
			switch (input) {
			case 1:
				System.out.println("조회");
				ss.list();
				break;
			case 2:
				System.out.println("등록");
				ss.add();
				break;
				
			case 3:
				System.out.println("수정");
				ss.modify();
				break;
			case 4:
				System.out.println("삭제");
				ss.remove();
				break;
			case 5:
				System.out.println("bye");
				return;	
			default:
				break;
		
			}
			
		}
		
	}

}
