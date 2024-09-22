package shape;

public class Circle extends implements D2 {
	private final int r;
	
	public Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	publuc double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	publuc double area() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;	
	}
	


	
}
