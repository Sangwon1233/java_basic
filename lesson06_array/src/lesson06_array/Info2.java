package lesson06_array;

import java.util.Arrays;

public class Info2 {
	public static void main(String[] args) {
		
		int [] arr= {10,5,3,8,4}; // new int[] 생략됨
		arr = new int [10]; 
		arr = new int[]{1,2,3}; //다시 값을 덮어쓸때 new int[]을 써야함
		
		//arr.length
		System.out.println(arr.length);
		char [] cArr= {'A','B','가','나'};
		String[]strArr = {"가나","다라"};
		
		System.out.println(arr);
		System.out.println(cArr);
		System.out.println(strArr);
		
		//배열 내부의 값을 간편하게 확인하는 함수
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strArr));
		
		
		
		
	}

}
