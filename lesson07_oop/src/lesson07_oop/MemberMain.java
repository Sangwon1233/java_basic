package lesson07_oop;

public class MemberMain {
	Member member =new Member();//클레스 안에 만드는 변수를 필드(Field)라고 한다
	int a = 10;
	public static void main(String[] args) {
	
	Member m = new Member();//제품 생성 어제 한 게임
	m.age=10;
	m.kor=90;
	m.eng=60;
	m.mat=80;
	System.out.println(m.kor+m.eng+m.mat);
	System.out.println(m.total());
	Member m2 = new Member();//오늘 한 게임
	m.kor=80;
	m.eng=100;
	m.mat=90;
	System.out.println(m.kor+m.eng+m.mat);
	System.out.println(m.total());
	Member m3 = m;

	//Member m = new Member();//제품 생성 어제 한 게임
	//int a = 1-; <new Member();인스턴스>
	//예>설계도:클래스,인터페이스,배열 타입
	//객체(변수)
	//=
	//new member():인스턴스
		if(m3 == m){
			System.out.println("m, m2는 같은 객체");
		}
	
		else {
			System.out.println("m,m2는 다른 객체");
			}
		
		MemberMain mm= new MemberMain();
		MemberMain mm2= new MemberMain();
		
		
	}
}