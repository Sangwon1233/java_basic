package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		//회차 반복문
		//반복문이 필요함 최소값 찾기
		
		//-최소값이 존재하는 인덱스
		//-0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
	int[] arr= {4,3,2,1,5,8,7,9};	

	
	int min=0;
	
	
		System.out.println("초기::"+Arrays.toString(arr));
		
		for(int i =0; i<arr.length;i++) {
			
			for(int j=0; j<arr.length-i;j++) {
				if(arr[j]<arr[i]) {
					System.out.printf("%d  %d\n",i,j);
					min=arr[j];
					System.out.println("담기   "+min);
					arr[j] =arr [j+1]
					
//					min = arr[j+1];
//					System.out.printf("%d  %d\n",i,j);
//					System.out.println("최소::"+Arrays.toString(arr));
//					arr[j+1]=min;
//					System.out.println("교환하기"+min);
				}
					
				
				
//				System.out.print(min + "," +arr[j]);
//				if(arr[i] > arr[j]){
//					min = arr[i];
//					min=arr[j];
//					System.out.print("   "+ min );
//					arr[i]=min;
//					
//					arr[i]=arr[i+1];
//						arr[i]=arr[i];
					
				
//				if(arr[i]<arr[j+1]) {
//					min=arr[j+1];
//					arr[i]=min;
//				}
					
//					arr[j+1]=min;
//					 System.out.println(Arrays.toString(arr));
//					
//				}
//			//System.out.println(Arrays.toString(arr));
////				System.out.println(Arrays.toString(arr));
//
		}
	
			
			
		}
	
		
	}

}
