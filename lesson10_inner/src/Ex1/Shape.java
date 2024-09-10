package Ex1;

public abstract class Shape {//부모
	
	private double length;
	private double area;
	
	public	Shape(double area){
		this.area = area; //생성자
	}
	
//	Shape(double length,double area,double volume){
//		this.length = length;
//		this.area = area;
//		
//	}
	
	void value() {
		System.out.println(this.length+this.area);
	}
	

}