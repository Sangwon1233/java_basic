package day2;

public class Circle {

	double r;
	
	public Circle() {} //기본 생성자
		// TODO Auto-generated constructor stub
	public Circle(double r) {
		setR(r);
	
	}
	Circle setR(double r) {
		this.r=r;
		return this;
	}
	
	Circle printRound() {
		System.out.println(Math.PI * r *2); //둘레출력
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI*r * r);
		return this;
	}
	
	void test() {
		double r =0;
		System.out.println(r);
		System.out.println(this.r);//여기서 this는 써클.r 멤버 지칭
	}
}
