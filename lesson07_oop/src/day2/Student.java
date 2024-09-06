package day2;

public class Student{
	
	//필드
	int no; //학번
	String name; //이름
	
	Student(){}
	
	Student(int i, String s){
		//생성자의 첫줄 super() 혹은 this()
		//super();
		no = i;
		name = s;
		
		}
		Student(String s, int i){
		this(s);
		no = i;
	
		}
		Student(String s){
		name = s;
		}
		
		void printThis() {
			System.out.println(this);
		}
		
		Student returnThis() {
			return this;//나의 인스턴스를 반환
		}
		
	
}
//this 미래에 생성될 예측 주소값