package lesson11_Exception;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			}
			catch(ArithmeticException e) { //정상적 작동은 캐치가 안잡아줌 
			System.out.println(5);
			}
		System.out.println(6);
	}

}

