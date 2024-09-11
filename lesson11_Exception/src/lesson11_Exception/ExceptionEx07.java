package lesson11_Exception;

import java.net.MalformedURLException;

public class ExceptionEx07 {
	public static void main(String[] args) throws Exception{
		//checked exception : 일반 예외
		
		//unchecked exception :런타임 예외
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("추가작업");
			throw e;
		}
		System.out.println("가능");
	}
	
	static void m1() throws Exception{//선언문의 연장		
		Exception ex =new Exception();
		throw ex;//s가 없는 쓰로우는 그냥 던지는거 
	}

}

	class A{
		void m() throws IOException{
			
		}
	}
	class B extends A{
	
		@Override
	public void m() throws MalformedURLException {
		
		}
	}	
	
