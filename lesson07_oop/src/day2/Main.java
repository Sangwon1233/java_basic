package day2;

public class Main {
	int i;
	static int si;
	
	void run() {
		System.out.println(this.i);
		System.out.println(Main.si);//클래스 이름으로 접근해라 여기서는 Main이 클래스 이름
		System.out.println(this);
		
	}
	
	static void sRun() {
//		System.out.println(i);
//		System.out.println(this);
		
	}
	public static void main(String[] args) {
	
		System.out.println(InitMain.arr2.length);//언급
		
//		class cls =InitMain.class;// 클래서 리터럴
//		class cls =class.forname("day2.InitMain");
	}

}
//클래스 초기화는 로드만 됐다하면 됨