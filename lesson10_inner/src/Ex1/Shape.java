package Ex1;

public abstract class Shape {//부모
	
	private double length;
	private double area;
	
	public	Shape(double length, double area){
		this.area = area; //생성자
		this.length = length;
	}
	
//	Shape(double length,double area,double volume){
//		this.length = length;
//		this.area = area;
//		
//	}
	
	void value() {
		System.out.println(this.length+this.area);
	}

	double length() {
		// TODO Auto-generated method stub
		return 0;
	}

	double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}