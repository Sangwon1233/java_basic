package Ex1;

public class Rectengle extends Shape {
	double width,height;
	
	
		    
		Rectengle(double length , double area) {
		super(length,area);
		this.width=length;
		this.height=area;
		}
		
		@Override
		double area() {
			return width * height;
			
		}
		@Override
		double length() {
			return 2*(width + height);
			
		}
		@Override
		public  String toString() {
			value[+width+height];
			
		}
		
}
