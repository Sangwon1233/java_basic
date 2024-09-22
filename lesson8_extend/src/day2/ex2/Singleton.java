package day2.ex2;

public class Singleton {
	private  static Singleton singleton = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() { //싱글턴 클레스
		return singleton;
		
	}
	
}
