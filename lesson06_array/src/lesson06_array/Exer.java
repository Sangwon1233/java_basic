package lesson06_array;

import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
//		// 1.모두의 마블
//		// 주사위 두개를 굴려서 이동한 거리를 계산
//		// 더블일 경우 한번 더 굴린다. 총 이동 거리를 출력 (a-b=0)일때 한번더
//		int sum=0;
//		for (;;){//do
//		int dice = (int) (Math.random() * 6) + 1;
//		int dice1 = (int) (Math.random() * 6) + 1;
//		
//		sum = dice+dice1;
//		if (dice == dice1) {//while(dice1==dice2); 같으면 또 위로가서 돌려라
//				System.out.println("(" + dice + "," + dice1 + ")" +sum+"칸 입니다.");
//					
//			} else {
//				System.out.println("(" + dice + "," + dice1 + ")"+sum+"칸 입니다.");
//				break;
//			}
//		}
//		

		// 2.두 수를 입력받아(정수) 두 숫자 사이의 정수의 합
		// ex) 3,10 : 3+4+5+6+7+8+9+10 // 10,3
		
				
//		int sum=0;
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값를 입력하시오 >");
		int a = scanner.nextInt();
		System.out.println("값를 입력하시오 >");
		int b = scanner.nextInt();
//		
//		// sum += 1;
//		// sum = sum + 1;
//		
//		int max = 0;
//		int min = 0;
//		
//				 
//		if(a<b) {
//			max = b;
//			min = a;
//		}else {
//			max = a;
//			min = b;
//		}
//		for (int i = min; i <= max; i++ ) {
//			sum += i;
//		}
//		
//		
////		if(a<b) {
////			for(int i=a;i<=b;i++) {
////				System.out.println("a : " + a);
////				System.out.println("sum : " + sum);
////				sum += i;
////				
////			}
////		}
////		else {
////			for(int j=a;j>=b;j--) {
////				sum += j;
////			}
////			
////		}
//		System.out.println("두 사이의 합은" +sum);
		
		
		
		
	
		
		

		// 3.자연수 두개 입력, 두 수의 최대 공약수 구하기
		// 12 18 >> 6구하기
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,18
		// 두 수의 공약수 1,2,3,6
		int dd =0;
		int i;
		int j;
		
		for( i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		for( j=1;j<=b;j++) {
			if(b%j==0) {
				System.out.println(j);
			}
			
		}
		i-j==0;
			
		
			
		
			
		System.out.println("두 수의 최대 공약수는");
		
		

		// 4.소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex ) 10 입력시 소수가 아닙니다.

		// 5.회문수 여부 구하기
		// 123321 : 회문수, 12345: 회문수 아님

		// a-b=0이면 한번더
		
	}

}