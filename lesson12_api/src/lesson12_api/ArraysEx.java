package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {// sort는 오름차순 정렬
	public static void main(String[] args) {
		String[] arr = {"홍길동","이순신","강감찬","김유신"};
		Arrays.sort(arr,(o1, o2) -> -o1.compareTo(o2));// bifunction o1,o2입력을 받아 하나의 출력
		System.out.println(Arrays.toString(arr));
		
		BiFunction<String, String, Integer> bi=(o1,o2) -> -o1.compareTo(o2);//내림차순
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 5);//배열 arr2 인덱스 전부에 5라는 숫자를 넣겠다
		Arrays.fill(arr2, new Random().nextInt(6)+1);
		
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = IntStream.rangeClosed(1, 6).limit(25).toArray();//1과 6사이 스트림이라는게 제한이 없다
		System.out.println(Arrays.toString(arr3));
	}

}
