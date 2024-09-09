package day2;

public class SuperEx {
	public static void main(String[] args) {
		
		Child Child = new Child();
		Child.print();
		
	}

}
class parent{
	int number = 3;
	public parent() {
	}
	
	
	public parent(int number) {
	super();
		System.out.println("부모 객체 생성");
	}
	object m() {
		return null;
		
	}
}
class Child extends parent{
	//int number =2;
	

	void print() {
		int number =1;
		System.out.println(number); //메서드 지역변수 넘버
		System.out.println(this.number); //자식 객체의 넘버
		System.out.println(super.number); // 부모 객체의 넘버
		
	}
	Integer m{
		return 0;
	}
}