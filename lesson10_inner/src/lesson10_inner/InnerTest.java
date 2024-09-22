package lesson10_inner;

public class InnerTest {
//	int i; //인스턴스가 객체 생성을 못해서 아직 못가져다씀
//	void m() {}
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner =outer.new Inner();
//		Outer.Inner inner = new Outer().new Inner();
		Outer.SInner siInner = new Outer.SInner();
				
	}

}

class Outer{ //외부 클래스 생성
	int i;
	static int si;
	
	class Inner{
		int i2;
		static int si2; //자기만의 각각의 멤버를 가짐 ,자기꺼의 필드는 가능
		{
			System.out.println(i);
			System.out.println(i2);
		}
	}
	static class SInner{
		int i3;
		static int si3;
		{
//			System.out.println(i);
			System.out.println(i3);
		}
	}
}