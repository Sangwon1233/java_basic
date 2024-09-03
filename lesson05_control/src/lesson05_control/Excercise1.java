package lesson05_control;

public class Excercise1 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i = 1 ; i <=100; i++) {	
		
			if(i%5==0) {
				sum+=i;
						
				
			}	
		
		}
		System.out.println("5의 배수의 합계는 :"+sum);//111페이지 연습문제 1번
		
		
		
		int evenSum=0;
		int oddSum=0;
		
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0){
				evenSum+=i;
				
			}
			else {
				oddSum+=i;
				
			}
		}
		
		System.out.println("짝수의 합계는 :"+evenSum);
		System.out.println("홀수의 합계는 :"+oddSum); //연습문제 2번
		
		
		for(int x=1;x<=6;x++){
			
			for(int y=1;y<=6;y++){
				
				if(x+y==6) {
					
					System.out.println("("+x+","+y+")"); //연습문제 3번
				}
				
			}
		}
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) 
			
					
					System.out.printf("%s",'*');
					
					System.out.println();
			
		}
		
		System.out.printf("====================================\n");		
		
			for(int i=1;i<5;i++) {
			
				for(int j=1;j<5;j++) {
					
					if(i+j <=4) {
				
					
					System.out.printf("*");	
				
					
					}
				}
				System.out.println();
			}
			
			System.out.printf("====================================\n");		
			
			for(int i=-2;i<3;i++) {
			
				for(int j=-2;j<3;j++) {
					
					if(i*j>=-1 && i*j<=1) {
						
							//System.out.printf("(%2d,%2d)",i,j);
							System.out.printf("*");				
					}
					else {
						System.out.println(' ');
						
					}
				}
			}
			
			boolean exit = false;
			int cnt = 0;
			while(!exit){
			int val=(int)(Math.random() * 6 +1);
			System.out.println("("+val+")");
			cnt++;
			if(val == 6) {
				exit =true;
				}
			}
			System.out.println(cnt +"회");
			
			//소수(prime number) :약수 구하기
			//2,3,5,7,11,13
			
			
	}
}




