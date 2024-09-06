package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		//회차 반복문
		//반복문이 필요함 최소값 찾기
		
		//-최소값이 존재하는 인덱스
		//-0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
		//인덱스 알아오기
//		String str = "123456";
//		System.out.println(str.indexOf("3"));//인덱스 위치 알려주는 것
//		
//		char[] cs = str.toCharArray();
//		
//		
//		int idx = -1; //확인하려고 -1 입력한거임
//		for(int i =0; i<cs.length;i++) {
//			if (cs[i]=='3') {
//				idx=i;
//				break;
//			}
//		}
		
		
		
//		
//		
//	int[] arr= {4,3,2,1,5,8,7,9};	
//	
//	
//	int min=0;
//	
//	
//		System.out.println("초기::"+Arrays.toString(arr));
//		
//		for(int i =0; i<arr.length;i++) {
//			
//			for(int j=0; j<arr.length-i;j++) {
//				if(arr[j]<arr[i]) {
//					System.out.printf("%d  %d\n",i,j);
//					min=arr[j];
//					System.out.println("담기   "+min);
//					arr[j] =arr [j+1];
//					
//					
//					min = arr[j+1];
//					System.out.printf("%d  %d\n",i,j);
//					System.out.println("최소::"+Arrays.toString(arr));
//					arr[j+1]=min;
//					System.out.println("교환하기"+min);
//				}
					
				
				
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
//		}
	
			
			
	//	}
	
//		int[] arr= {5,4,2,1,7};
//		
//		for(int i=0; i<arr.length;i++) {
//			int idx =0;//0번 인덱스
//			for(int j=0; j<arr.length ;j++) {
//				if(arr[idx] >arr[j]){//arr이 더 작냐
//					//min =arr[idx];//작으면 교체하겠다
//					idx =j;
//				}
//			}
//	
//		System.out.println(idx);
//		int tmp =arr[idx];//최소값이 idx변수에 들어있고 그걸 tmp에 담는다
//		arr[idx] = arr[0]; //{5,4,2,5,7}
//		arr[0] = tmp; // {1,4,2,5,7}
//	}
		
		int[] arr= {5,4,2,1,7};
		
		for(int i=0; i<arr.length;i++) {
			int idx =i;//0번 인덱스
			for(int j=i; j<arr.length ;j++) {
				if(arr[idx] >arr[j]){//arr이 더 작냐
					//min =arr[idx];//작으면 교체하겠다
					idx =j;
				}
			}
	
		System.out.println(idx);
		int tmp =arr[idx];//최소값이 idx변수에 들어있고 그걸 tmp에 담는다
		arr[idx] = arr[i]; //{5,4,2,5,7}
		arr[i] = tmp; // {1,4,2,5,7}
		System.out.println(Arrays.toString(arr));
	}
		
	
		
	}


}
//인덱스 주소를 못찾으면 -1로 나옴