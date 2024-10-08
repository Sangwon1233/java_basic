//package student;
//
//import java.util.Scanner;
//
//public class StudentUtils {
//	static Scanner scanner = new Scanner(System.in);
//	
//	static String nextLine(String msg) {
//		System.out.println(msg);
//		System.out.print("> ");
//		return scanner.nextLine();
//	}
//	
//	static int nextInt(String msg) {
//		return Integer.parseInt(nextLine(msg));
//	}
//	
//	
////	static Student add1(){
////		int no1=StudentUtils.nextInt("학번을 입력하세요");
////		String name1=StudentUtils.nextLine("이름을 입력하세요");
////		int kor1=StudentUtils.nextInt("국어을 입력하세요");
////		int eng1=StudentUtils.nextInt("영어을 입력하세요");
////		int mat1=StudentUtils.nextInt("수학을 입력하세요");
////		
////		return new Student(no1,name1,kor1,eng1,mat1);
////	}
//	
//}

package student;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);

//	static String nextLine(String msg) {
//		System.out.println(msg);
//		System.out.print("> ");
//		return scanner.nextLine();
//	}
//
//	static int nextInt(String msg) {
//		return Integer.parseInt(nextLine(msg));
//	}

	// 입력 통합
	static <T> T next(String msg, Class<T> clazz) {
		System.out.println(msg);
		System.out.print("> ");
		String str = scanner.nextLine();
		if (clazz == Integer.class) {
			return clazz.cast(Integer.parseInt(str));
		} else if (clazz == String.class) {
			return clazz.cast(str);
		} else {
			throw new RuntimeException("잘못된 타입");
		}
	}
	/*
	 * () -> {} Runnable (1) -> {} Consumer () -> {1} Supplier (1) -> {1} Function
	 * (1) - > {b} Predicate
	 */

	// 입력 반복
	static <T> T next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
		while (true) {
			try {
				T t = next(msg, clazz);
				if (con.test(t)) {
					return t;
				} else {
					throw new IllegalArgumentException(errMsg);
				}
			} catch (NumberFormatException e) {
				System.out.println("올바른 숫자를 입력하세요");
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			} 
		}
	}
}
