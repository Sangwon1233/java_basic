package lesson11_Exception;


public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println("main 전");
		m1();
		System.out.println("main 후");
	}
	static void m1() {
		try {
		m2();
		
	}	catch(ArithmeticException e) {
		System.out.println("Arithmetic 예외처리");
		}
	}
	static void m2() {
		System.out.println("m2() 전");
		try {
		m3();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("index 예외 처리");
		}
		finally {
			System.out.println("m2() 후(finally)"); //다 있어야함 (오류든 성공이든 나옴)
		}
		System.out.println("m2() 후");
	}
	static void m3() {
		//로직 수행
		System.out.println(3/0);
		
	}

}
