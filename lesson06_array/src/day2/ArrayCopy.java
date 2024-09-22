package day2;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		//arraycopy 복사
		int[] src = {1,2,3,4};
		int[] dest = new int [src.length *2];//원본 배열의 2배
				
//		System.arraycopy(src, 1, dest, 2, src.length);//원본, 원본 시작 위치 ,사본, 사본의 시작 위치  ,원본의 길이값
//		
//		System.out.println(Arrays.toString(dest));
			
		
			int[] result = Arrays.copyOf(src, 10);
			System.out.println(Arrays.toString(result));
		
	}

}
