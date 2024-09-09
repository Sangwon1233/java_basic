package day2.ex2;

public class SingletonTest {
//	final : 클래스(이 클레스에 대한 상속은 여기까지입니다 String)인스턴스 초기화 전까지만 상수값을 정해주면 됨
//	메서드(오버라이드 금지 . 재정의를 허용하지않을때 붙인다 다른값으로 더이상 대입못함)
//	필드 ()
	
	public static void main(String[] args) { //한개의 객체로 여러개를 사용한다
		
//		Singleton singleton = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//회원
		//책
		//구매
		
		
	}

}
