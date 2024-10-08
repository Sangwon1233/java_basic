package day2.ex2;

abstract class Shape{
	String type;
	Shape(String type){
		this.type=type;
	}
	abstract double area();
	abstract double length();
}
class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r=r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "shape [type="+type+",r="+r+"]";
		
	}
}
class Rectangle extends Shape{
	int width,height;
	Rectangle(int width, int height){
		super("사각형");
		this.width = width;
		this.height = height;
		
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*(width * height);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape[type=" +type+",width="+width+",height="+height+"]";
	}
	
}
public class ShapeEx{
	public static void main(String[]args) {
		Shape[] shape =new Shape[2];
		shape[0] = new Circle(10);
		shape[1] = new Rectangle(5,5);
		
		for(Shape s: shape) {
			System.out.println(s);
			System.out.println("넓이:"+s.area()+"둘레:"+s.length());
		}
	}
}
