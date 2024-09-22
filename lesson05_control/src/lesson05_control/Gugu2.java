package lesson05_control;

public class Gugu2 {
	public static void main(String[] args) {
		
		for(int i =2; i<=9; i++) {
			System.out.println("["+i+"]단");
		for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.printf("=======================");
		// A*B=C
		//B가 5였을때 건너뛰고 출력
		
		for(int i =2; i<=9; i++) {
			System.out.println("["+i+"]단");
		for(int j=1;j<=9;j++) {
			if(j==5) {
				continue;
			}
			System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.printf("=======================");
	
		// A*B=C
		//B가 5였을때 건너뛰고 출력
		//B가 5였을때 반복 정지
		
		for(int i =2; i<=9; i++) {
			System.out.println("["+i+"]단");
		for(int j=1;j<=9;j++) {
			if(j==5) {
				break;
			}
			System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.printf("=======================");
		
				// A*B=C
				//B가 5였을때 건너뛰고 출력
				//B가 5였을때 반복 정지
		
				//A가 5여씅ㄹ대 건너뛰고 출력
				
				for(int i =2; i<=9; i++) {
					if(i==5) {
						continue;
						
					}
					System.out.println("["+i+"]단");
				for(int j=1;j<=9;j++) {
					 
					System.out.println(i+"*"+j+"="+i*j);
					}
				}
				System.out.printf("=======================");
				
				
				// A*B=C
				//B가 5였을때 건너뛰고 출력
				//B가 5였을때 반복 정지
		
				//A가 5여씅ㄹ대 건너뛰고 출력
				//B가 5였을때 i 반복 정지
				
				
				point: //B가 5였을때 i 반복 정지
				for(int i =2; i<=9; i++) {
				
					System.out.println("["+i+"]단");
				for(int j=1;j<=9;j++) {
					if(i==5) {
						break point;
					}
					 
					System.out.println(i+"*"+j+"="+i*j);
					}
				}
				System.out.printf("=======================");
	}
	

}