package lesson10_inner;

import java.security.PublicKey;

public class LocalTast {
	
	static MyInter create() { //스테틱은 마이인터를 바로 호출 가능
		class MyClass implements MyInter{ //여기는 메서드 영역
			public void MyClass() {
				
			}
			@Override
			public void run() {
				System.out.println("MyClass.run()");
			}
			
		}
		return new MyClass();
	}
	static MyInter create2() {
		return new MyInter() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("create2().run()");				
			}
		};
	}
	static MyInter create3() {
		return() -> System.out.println("lambda.run()"); //람다식은 오브젝트가 되지 못한다.
	}
	
	public static void main(String[] args) {
		MyInter mi= create();
		mi.run();
		create2().run();
		create3().run();
	
	}

}

//익명 클래스
interface MyInter{
	void run();//추상메서드인 런
	
}
