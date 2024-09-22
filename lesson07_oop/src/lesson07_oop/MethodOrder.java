package lesson07_oop;

public class MethodOrder {
	public static void main(String[] args) {
		
		MethOdEx ex = new MethOdEx();
		
		ex.one(); //메서드 실행
		
	}
}

class MethOdEx{
	void one() {
		System.out.println("one");
		two();
		System.out.println("one end");
	}
	void two () {
		System.out.println("two start");
		three();
		System.out.println("two start");
	}
	void three() {
		System.out.println("three");
	
	}
}
