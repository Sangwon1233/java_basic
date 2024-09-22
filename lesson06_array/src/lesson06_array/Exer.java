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
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("값를 입력하시오 >");
//		int a = scanner.nextInt();
//		System.out.println("값를 입력하시오 >");
//		int b = scanner.nextInt();
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
		
//		int num1 = 10;
//		int num2 = 3;
//		int sum =0;
//		
//		if(num1>num2) {
//			int tmp =num1;
//			num1=num2;
//			num2=tmp;
//		}
//		for(int i = num1; i<=num2;i++) {
//			sum+=i;
//			
//		}
//		System.out.println(sum);
//		
//		
//		
//		
		
		
//		if(a<b) {
//			for(int i=a;i<=b;i++) {
//				System.out.println("a : " + a);
//				System.out.println("sum : " + sum);
//				sum += i;
//				
//			}
//		}
//		else {
//			for(int j=a;j>=b;j--) {
//				sum += j;
//			}
//			
//		}
//		System.out.println("두 사이의 합은" +sum);
		
		
		
		
	
		
		

		// 3.자연수 두개 입력, 두 수의 최대 공약수 구하기
		// 12 18 >> 6구하기
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,18
		// 두 수의 공약수 1,2,3,6
		
		//12 18 12
		//	18 12 6
		//		12 6 0
		
		//	145	15	10
		//		15	10	5
		//			10	5	0
//		int i;
//		int j;
//		
//		for( i=1;i<=a;i++) {
//			if(a%i==0) {
//				System.out.println(i);
//			}
//		}
//		for( j=1;j<=b;j++) {
//			if(b%j==0) {
//				System.out.println(j);
//			}
//			
//		}
//		
//			System.out.println("두 수의 최대 공약수는");
//			
			
		
			int num1=12;
			int num2=18;
			int result =0;
			
//			for(int i =1; i<=num1; i++) {
//				for(int j =1; j<=num2; j++) {
//				if(num1 % j ==0 && num2 % j ==0 && i==j) {
//				//System.out.println(j);
//					result = i;
//				}
//					//System.out.println("%d : %d\n",i,num1%i);
//			}
//		}
			//System.out.println(result);
			
			//12 18 12
			//	18 12 6
			//		12 6 0
			
//			boolean flag =true;
//			while(flag) {
//				System.out.printf("%d %d\n",num1,num2);
//				System.out.printf("%d \n",num1%num2);
//				int tmp= num1 % num2;
//				num1=num2;
//				num2=tmp;
//				System.out.printf("%d %d %d\n",num1,num2,tmp);
//				if(tmp ==0) {
//					flag = false;
//					
//					System.out.println(num1);
//				}
//				
//			
//			}
//			
//			
			
		
		

		// 4.소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex ) 10 입력시 소수가 아닙니다.
//			System.out.println("===============================");
//			outer:	 
//		for(int i =num1; i<=num1*num2;i+=num1) {
//			System.out.println(i);
//			for(int j =num2; j<=num1*num2;j+=num2) {
//				System.out.println(j);
//				if(i == j){
//					System.out.println(j);
//					
//			break outer;
//				}
//			}
//		}	
//			
//			
//			int num =10;
//			flag = true;
//			for(int i =2; i<=num; i++) {
//				if(num % i ==0) {
//					flag = false;
//					break;
//				}
//				//System.out.printf("%d : %d\n",i,num % i);
//			}
//			System.out.println(num + "은"+(flag? "소수" : "소수아님"));
//			
		

		// 5.회문수 여부 구하기
		// 123321 : 회문수, 12345: 회문수 아님
		
		int num = 12345; //54321
		result =0;
		int tmp = num;
		
		while(tmp !=0) { //0이 아닐때
			
			//System.out.println(tmp);
			//System.out.println(tmp %10); //나누기 10은 일의 자리 나누기
			result = result * 10 + tmp % 10; // 5 //
			tmp/=10;//전에꺼에서 나누기 10 ///1234
			System.out.println(result);
		}
	
		
		System.out.println(result == num ? "회문수" : "아님");
		
		System.out.println(num == result);
		
	}

}