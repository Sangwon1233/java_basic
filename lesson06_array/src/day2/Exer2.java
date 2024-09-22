package day2;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		//1.지폐 동전 세기
		int money =123456;
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] counts = new int [10]; //null
		
		//int a =10;
		//a = a+ 5-3;
		//a=a+5;
		//a=a-3;
		
//		System.out.println(money/units[0]);
//		money %= units[0];
//		System.out.println(money/units[1]);
//		money %= units[1];
//	
		
		for(int i=0; i<units.length;i++) {
			counts[i]=money/units[i];
			money %= units[i];
			
		}
		for(int i=0; i<counts.length;i++) {
			System.out.printf("%d원 %d" + (units[i] >= 1000 ? "장" : "개") + "\n"
							,units[i] , counts[i]);
		}
		
//		System.out.println(1234 % 100 );
//		System.out.println((1234 % 100 )% 50 );
//		System.out.println(1234 % 50 );
//		
//		System.out.printf("%d\n" ,123456 / units[0]);
//		System.out.printf("%d\n" ,(money % units[0]) / units[1]);
//		System.out.printf("%d\n" ,(money % units[1]) / units[2]);//3456
//		System.out.printf("%d\n" ,(money % units[2]) / units[3]);
//		
		
//		System.out.printf("%d\n" ,money / units[4]);
//		System.out.printf("%d\n" ,money / units[5]);
//		System.out.printf("%d\n" ,money / units[6]);
//		System.out.printf("%d\n" ,money / units[7]);
//		System.out.printf("%d\n" ,money / units[8]);
		
		
//
//		for(int i=0;i<units.length;i++) { 
//			
//			if(i!=0){
//				
//				counts[i]= (money % units[i-1])/ units[i];
//				
//				
//			}
//			else {
//				counts[0] = money / units[0];
//				
//			}
//			
//		}
//
//		System.out.println(Arrays.toString(counts));
//			
			
		

		// 10을 나누면 1원짜리들 100을 나누면 10원짜리들 1000을 나누면 100원짜리들 10000을 나누면 10000들 100000들이 나오는데
		//0부터 하나씩 증가하면서 나와야함
		//

	
		//{2,2,0,3,0,4,1,0,1,1}
		
		//2.scanner 사람 이름을 입력 받습니다.
		// 입력 글자중 q를 입력하면 입력 종료
		//사람이름들을 문자열 배열 만들어서
		//프로그램 종료직전 확인
		
//		char t= '1';
//		char t1 = '1';
//		char t2 = '1';
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		
//		int input = Integer.parseInt(scan.nextLine());
//		while(true) {
//		switch(input) {
//		case 1:
//			System.out.println(c);
//			String in = String.(scan.nextLine());
//			String c = scan.nextLine();
//		}
//		String c1 = "q";		
//		}
//		
//		System.out.println(c.equals(c1));
		
	Scanner scanner = new Scanner(System.in);
	String[] strings = new String[3];
//	String[] temp = {"abc","def"};
//	temp=Arrays.copyOf(temp,temp.length*2);
//	System.out.println(Arrays.toString(temp));
//	
	for(int i=0;;i++) {//무한루프인데 i값이 필요해서 넣었음 while 써도되는데 따로 선언해야함
		System.out.println("이름 입력>");
		String str = scanner.nextLine();
		if(str.equals("q")) {
			System.out.println("bye");
			strings=Arrays.copyOf(strings,i);
			break;
		}
		
		//배열 늘리기
		if(strings.length ==i) {
			System.out.println("문제 발생 직전");
			strings=Arrays.copyOf(strings,strings.length *2); //배열 늘리기
		
			}
		strings[i] = str;
	}
	
	for(String s : strings) {
	//	if(s != null)
		System.out.println(s);
	}
	
//		
	}
//
}


