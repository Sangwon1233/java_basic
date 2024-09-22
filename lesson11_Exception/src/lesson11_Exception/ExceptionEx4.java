package lesson11_Exception;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			Integer.parseInt("a"); 
			System.out.println(args[0]);
			System.out.println(4/0);
			
			}
			catch(ArithmeticException e) { //e는 익셉션의 e
			System.out.println(5);
			}
			catch(IndexOutOfBoundsException e) {//인덱스 오류때 사용
			System.out.println(6);
			}
			catch(Exception e) {
				System.out.println("최후의 처리");//최고 조상
	//			e.printStackTrace();
				System.out.println(e.getClass().getName());
				System.out.println(e.getMessage());
				StackTraceElement[] element =  e.getStackTrace();
				for(StackTraceElement ste : element) { 
					System.out.println(ste.getMethodName());
					}
				}
		
				System.out.println(7);
			
	}

}

