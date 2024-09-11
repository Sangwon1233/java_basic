package shape;

public class Rect extends Shape {

	
	private int x;
	private int y;
	public Rect(int x, int y) {
		super("사각형")
		this.x=x;
		this.y=y;
	}
	public Rect(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
	return 0;
	}
	
	@Override
	public double lenhth() {
	return (x+y)*z;
	

	}

}
