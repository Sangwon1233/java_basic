package lesson05_control;

public class Excercise1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0;i<10;i++) {
		System.out.printf("5의 배수의 합계는 %d\n",5*i);
		sum += i;
			
		}
		System.out.printf("%5d",sum);
	
		sum = 0;
		int i =1;
		
		while (i<=100) {
			sum +=i;
			System.out.printf("i : %d, sum : %d\n" ,i,sum);
			i++;
			
		}
		System.out.println("합계 : "+sum);
				
	}
}
