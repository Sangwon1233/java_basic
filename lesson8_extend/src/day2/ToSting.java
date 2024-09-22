package day2;

public class ToSting {
	public String toString() {
		return "재정의된 내용";
	}
	public void print() {
		System.out.println(super.toString());//조상꺼
		System.out.println(this.toString());//내꺼(인스턴스 변수내에서 사용가능)
	}
	public static void main(String[] args) {
		
//		Object object = 10;
//		Object object = null;
//		Object object = "abcd";
		//toString():객체의 내용을 문자열로 확인할 때 자동 호출되는 메서드
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());
		
		
		ToSting ts = new ToSting();
		System.out.println(ts);
		System.out.println(ts.toString());
		
		
	}

}
