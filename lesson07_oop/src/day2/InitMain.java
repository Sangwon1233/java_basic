package day2;

import java.util.Arrays;

import dat2.sub.test.Main;

public class InitMain {
	int num=10;
	int[] arr = new int[10];
	static int[] arr2 =new int[10];
	//클래스 구간에서는 for if 이런 수식 불가(제어문 조건문 호출x)
	
	public InitMain(){
		System.out.println("생성자");
		System.out.println(Arrays.toString(arr));
		}
		{
		System.out.println("초기화 블럭");
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr2));
		}
			
		static {
			System.out.println("클래스 초기화 블럭");
			for(int i=0; i<arr2.length;i++) {
				arr2[i] = (int)(Math.random()*100);
			}
	}
		public static void main(String[]args) {
			System.out.println("메인 시작");
			InitMain initmain=new InitMain();
			InitMain initmain2=new InitMain();
			new InitMain();
			System.out.println("메인 끝");		

		}
}
//우선순위 클래스 초기화가 제일 빠르다.(method 영역)
//heap 공간에 무언가 생기게 할려면 new
//인스턴스 초기화는 생성할때마다 초기화한다