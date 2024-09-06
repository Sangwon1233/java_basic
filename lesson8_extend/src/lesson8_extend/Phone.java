package lesson8_extend;

public class Phone {
	
	String name;
	String color;
	String company;
	
	public Phone() {}
	
	
	public Phone(String name, String color, String company) {
		super();
		this.name = name;
		this.color = color;
		this.company = company;
	}


	void call() {
		System.out.println("전화를 건다");
		
	}
	void receive() {
		System.out.println("전화를 받다");
		
	}


	@Override
	public String toString() {
		return getClass().getClass()+" [name=" + name + ", color=" + color + ", company=" + company + "]"; //오브젝트에서 쓰는 투스트링을 다시 고쳐씀
	}
	
}
