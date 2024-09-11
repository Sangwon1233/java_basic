package Ex1;

public class Circle extends Shape {
//	private static double length;
//	private static double area;
	int r;
	
	Circle(int r){
		super(r,r);
		this.r=r;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "value"[r];
	}
	
	
}
