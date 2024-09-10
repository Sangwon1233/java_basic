package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
//		System.out.println(com.INK);
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);
		
//		System.out.println(com.FAX_NUMBER);
		System.out.println(Fax.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Fax fax = new Fax() {
			
			@Override
			public void send(String mag) {
				// TODO Auto-generated method stub
				System.out.println("fax 송신");
				
			}
			
			@Override
			public void receive(String msg) {
				// TODO Auto-generated method stub
				System.out.println("fax 수신"); //익명클래스 구간
				
			}
		};
		
		fax.send("abcd");
		
		Complexer com2 = new Complexer() {
			public void scan() { //익명구간에서 인스턴스를 만들면서 오버라이드
				System.out.println("com2의 스캔");
			}
			
		};
		
		com2.print();
		com2.scan();
		
		
		//메소드는 동사로 하는게 좋음
		//클래스 이름은 명사형 인터페이스는 행위자,명사
		//compare 비교하다 //comparator 비교자
		//comparable : 
		//연관성있는애들만 묶는다
		//할수있다 able되면 interface가 된다
		
		
	}

}
