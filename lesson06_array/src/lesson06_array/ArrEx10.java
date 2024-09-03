package lesson06_array;

public class ArrEx10 {
	public static void main(String[] args) {
		
		int[] arr = {5,10,20,7,3};
		//해당 배열에서 최대값을 구해서 출력
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++)
			if(max < arr[i]) {
				max = arr[i];	
			}
			else if(min >arr[i]) {
				min = arr[i];
			}
		System.out.println(max);
		System.out.println(min);
		
//		int max = arr[0];// 0번 인덱스로 초기화
//		
//		if(max < arr[1]) {
//			max = arr[1];
//		}
//		if(max < arr[2]) {
//			max = arr[2];
//		}
//		if(max < arr[3]) {
//			max = arr[3];
//		}
//		if(max < arr[4]) {
//			max = arr42];
//		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
	
		}
		
		System.out.println(arr[2]);
		
		
		
		
		
		//배열 요소의 합계 /평균 구하기
		int s=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			s += arr[i];
			
			 
		}
		 double a = 1.0 * s / arr.length; //평균값은 소수가 나오므로 더블쓰기
		 System.out.println(s);
		 System.out.println(a);
		 
		
	}

}
