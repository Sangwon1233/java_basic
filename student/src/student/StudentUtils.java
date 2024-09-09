package student;

import java.util.Scanner;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {
		System.out.println(msg);
		System.out.print("> ");
		return scanner.nextLine();
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
//	static Student add1(){
//		int no1=StudentUtils.nextInt("학번을 입력하세요");
//		String name1=StudentUtils.nextLine("이름을 입력하세요");
//		int kor1=StudentUtils.nextInt("국어을 입력하세요");
//		int eng1=StudentUtils.nextInt("영어을 입력하세요");
//		int mat1=StudentUtils.nextInt("수학을 입력하세요");
//		
//		return new Student(no1,name1,kor1,eng1,mat1);
//	}
	
}
