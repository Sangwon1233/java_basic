package day2.ex2;

public class PolyEx {
	public static void main(String[] args) {
		//조상타입 객체 = new 자손생성자();
		
		Child c = new Child();
		c.walk();
		c.run();
		c.eat();
		System.out.println(c);
		
		Parent p = new Child();
		p.walk();
		p.run();
		((Child)p).eat();
//		p.eat();
		System.out.println(c);
		
		Parent p2 =new Parent();
//		p2 = p; //행변환이 가능한가 물어보기
//		((Child)p2).eat();//여기서 오류는 나지만 컴파일이 되는건 관계가 있어서
		
		//Uncle u = new Child();
		Uncle u = new Uncle();
		u.walk();
//		((Child)u).walk(); //여기오류는 아예 관계가 없어서
		
// instanceof
		if(p2 instanceof Parent) {
			System.out.println("p2는 Parent의 인스턴스");
			
		}
		if(p2 instanceof Child){
			System.out.println("p2는 Child의 인스턴스");
			
		}
	}

}
