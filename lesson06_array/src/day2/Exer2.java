package day2;

import java.util.Arrays;

public class Exer2 {
	public static void main(String[] args) {
		//1.지폐 동전 세기
		int money =123456;
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] counts = new int [10]; //null

				

		for(int i=0;i<units.length;i++) {
			System.out.print(Arrays.toString(units));
		}
		
		
		
		
		
		
		
		System.out.printf("%d\n" ,money / units[0]);
		System.out.printf("%d\n" ,money / units[1]);
		System.out.printf("%d\n" ,money / units[2]);
		System.out.printf("%d\n" ,money / units[3]);
		System.out.printf("%d\n" ,money / units[4]);
		System.out.printf("%d\n" ,money / units[5]);
		System.out.printf("%d\n" ,money / units[6]);
		System.out.printf("%d\n" ,money / units[7]);
		System.out.printf("%d\n" ,money / units[8]);
		
		
		
		 
		// 10을 나누면 1원짜리들 100을 나누면 10원짜리들 1000을 나누면 100원짜리들 10000을 나누면 10000들 100000들이 나오는데
		//0부터 하나씩 증가하면서 나와야함
		//

	
		//{2,2,0,3,0,4,1,0,1,1}
		
		//2.scanner 사람 이름을 입력 받습니다.
		// 입력 글자중 q를 입력하면 입력 종료
		//사람이름들을 문자열 배열 만들어서
		//프로그램 종료직전 확인
	}

}
	
	
