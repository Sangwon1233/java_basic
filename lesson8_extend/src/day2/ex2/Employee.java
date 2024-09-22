package day2.ex2;

public abstract class Employee {
	String name;
	
	public Employee (String name) {
		this.name = name;
		
	}
	
	void startWolk(){
		System.out.println("출근합니다");
	}
//	void wolk(){
//		System.out.println("업무합니다");
//	}
	abstract void work();
	
	void endtWolk(){
		System.out.println("퇴근합니다");
	}
	
	public String toString() {
		return name;
	}

}
