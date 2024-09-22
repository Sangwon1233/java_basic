package lesson07_oop;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		//작은 인덱스에서부터 시작 (회차)
		//어레이카피쓰면 편함 원래는 반복문으로 하나하나 다 비교
		//현재 위치의 인덱스 미만의 값들과 대소 비교
		//대소비교이후에 내가 더 작다면 내가있을자리를 알아야함 -조건 검사 후 해당 위치에 삽입 예정
		//-해당 위치에서 부터 한칸씩 우측 이동
		// -예정 위치에 해당 값 대입
		
	int[] arr= {1,3,4,5,2};
//		
//		//3번 인덱스의 값을 맨앞으로 보내기
//		if(arr[3] < arr[2]) {
//			int tmp = arr[3];
//			arr[3]=arr[2];
//			arr[2] =tmp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[2] < arr[1]) {
//			int tmp = arr[2];
//			arr[2]=arr[1];
//			arr[1] =tmp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[1] < arr[0]) {
//			int tmp = arr[1];
//			arr[1]=arr[0];
//			arr[0] =tmp;
//		}
//		System.out.println(Arrays.toString(arr));
		//{3,5,4,1,2} >> {3,5,1,4,2} >>{3,1,5,4,2} >>{1,3,5,4,2}
	for(int j =0; j<arr.length;j++) {
		System.out.println(j+ "회차");
		for(int i=j; i>0;i--) {
			if(arr[i] < arr[i-1]) {
				int tmp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1] =tmp;
				}
			System.out.println(Arrays.toString(arr));
			}
			
		}
	}
}
