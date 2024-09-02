package lesson05_control;

public class Excercise1 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i = 1 ; i <=100; i++) {	
		
			if(i%5==0) {
				sum+=i;
				
				
				
			}
		
		
		
		}
		System.out.println("5의 배수의 합계는 :"+sum);
		
		
		
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
		System.out.println("홀수의 합계는 :"+oddSum);
		
		for(int x=1; x<=6;x++){
			
			for(int y=1;y<=6;y++){
				
				if(x+y==6) {
					
					System.out.println("("+x+","+y+")");
				}
				
			}
		}
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) 
			
					
					System.out.printf("%s",'*');
					
					System.out.println();
			
		}
		
	}
}




