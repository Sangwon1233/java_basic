package day2.ex2;

public class Init {
	private static Init init = new Init();//계속 Init 를 계속 입력시켜서 스택틱 오버플로우걸림  스태틱이 붙으면 초기화 한번만함 
	public Init() {
		System.out.println("초기화");
	}
	public static void main(String[] args) {

	}

	
	static int fact(int i) {
		if(i == 1) {
			return 1;
		}
		return fact(i-1)*1;
		
	}
}
