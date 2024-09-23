//package student;
//
//import java.util.Scanner;
//
//public class StudentMain {
//	public static void main(String[] args) {
//		// UI 계속 루프가 돈다 예전 은행같은 느낌
//		//Create Read Update Delete = CRUD 데이터를 다룰때 사용한다
//		//CAR배열 =학생 배열 
//		Scanner scanner = new Scanner(System.in);
//		StudentService ss = new StudentService();
//		
//		while(true) {
//			try {
//			int input = ss.checkRange(StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료"),1,5);
//			
//			switch (input) {
//			case 1:
//				System.out.println("조회");
//				ss.sort();
//				ss.list();
//				break;
//			case 2:
//				System.out.println("등록");
//				ss.add();
//				break;
//				
//			case 3:
//				System.out.println("수정");
//				ss.modify();
//				break;
//			case 4:
//				System.out.println("삭제");
//				ss.remove();
//				break;
//			case 5:
//				System.out.println("bye");
//				return;	
//			default:
//				break;
//		
//				}
//			
//			}
//				catch (NumberFormatException e) {
//					System.out.println("정확한 숫자를 입력하세요");
//				}
//				catch (RuntimeException e) {
//					System.out.println(e.getMessage());
//				}
//			}
//		
//	}
//
//}

package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;



public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		
				
		StudentService ss = new StudentService();
		
		while(true) {
			try {
				int input = ss.checkRange(StudentUtils.next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료",Integer.class));
				switch (input) {
				case 1:
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
					List<Student> students=(List<Student>)ois.readObject();
					ss.setStudents(students);
					ss.list();
					break;
				case 2:
					ss.add();
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
					oos.writeObject(ss.getStudents());
//					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("student.txt"));
					oos1.writeObject(ss.getStudents());
//					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("student.txt"));
					oos2.writeObject(ss.getStudents());
//					ss.cloneAndSort();
					break;
				case 5:
					ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream("student.txt"));
					oos3.writeObject(ss.getStudents()); // 
					System.out.println("bye");
					return;
				default:
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}