package Ex1;

public class ShapeMain {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(4);
		shapes[1] = new Rectengle(8,6);
//		shapes[2] = new Cylinder();
//		shapes[3] = new Hexa();
//		
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
}
