package student;

public class RangeException  extends RuntimeException{

	int start;

	
	public RangeException(int start) {
		this.start=start;
	}


}

