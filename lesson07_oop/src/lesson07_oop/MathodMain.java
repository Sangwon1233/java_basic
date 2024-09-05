package lesson07_oop;

public class MathodMain {
	public static void main(String[] args) {
		int a = 10;
		Param p = new Param();
		//argument (10,20)
		//parameter 매개변수
//		int result = p.add(10, 20);
//		System.out.println(result);
//		System.out.println(p.add(30, 40));
//		System.out.println(new Param().add(40, 50));
//		int b = Param.add2(10,20);
//		System.out.println(b);
		int c =Param.max(new int[]{10,20,5,30,1,4,50});
		System.out.println(c);
		System.out.println(Param.max(new int[] {}));
		System.out.println(Param.max(null));
		
//		String str= "가나다라";
//		String s1=str
//		.substring(0, 2)
//		.concat("AB")	
//		.substring(1, 3);
//		System.out.println(s1);
//		
		System.out.println(Param.min(1,2,3,4,5,6));
		System.out.println(Param.min());//길이가 0인 배열
		System.out.println(Param.min(new int[] {3,4,5})); //길이가 0인 배열
		
		System.out.printf("%d,%d,%d,%s",123,12,1,"가나다라");
	}

}

class Param{
	int add(int a, int b) {
		return a +b;
	}
	static int add2(int a, int b) {
		return a +b;
	}
	
	//가변 인자 최대값
	static int max(int[] arr){
		if(arr == null || arr.length ==0) {
			return -1; //
		}
		int ret = arr[0];
		for(int i : arr) {
			if(ret < i) {
				ret = i;			
			}
		}
		//최대값 처리
		return ret;
	}
	
	//최소값
	static int min(int ... num){
		if(num == null || num.length ==0) {
			return -1; //
		}
		int ret = num[0];
		for(int i : num) {
			if(ret > i) {
				ret = i;	
			}
		}
		
				return ret;
	}
		
}
//stack 일력이 push 출력이 pop a,b,c가 들어가면 c,b,a가 나옴
//main에 의해 프로그램이 실행됨