package shape;

public class Cylinder extends Shape implements D3 {
	private Circle circle; //원을 가지고있다
	private int z;

	public Cylinder(int r, int z) {
		super("원기둥");
		circle = new Circle;
		this.z = z;
	}//2가지 방법
	public Cylinder(Circle, int z) {
		super("원기둥");
		this.circle = circle;
		this.z = z; 

	}
	
	@Override
	public double volum() {
		// TODO Auto-generated method stub
		return circle.area()*z;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return circle.area()*2 + circle.length() * z;
	}
	
	
	
	
}
	