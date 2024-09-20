package lesson15_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ObjLongConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class LambdaEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(30, 10, 20, 30, 40));
		list.forEach(i -> System.out.println(i));// 해당 리스트의 하나씩 출력함
		list.removeIf(i -> i <= 20); //20이하 삭제 
		System.out.println(list);
		list.replaceAll(s-> s +10);//모든 식이 10씩 플러스 됨
		System.out.println(list);
		
		DoubleConsumer dc= d ->System.out.println( d * d);//consumer는 반환을 안해서 바로 출력
		dc.accept(10);
		
		ObjLongConsumer<String> olc = (s,l) -> System.out.println("문자열 : " + s + ", long : " + l);
		olc.accept("새똥이", 12L);
		
//		List<String> list2 = Stream.of(5,4,3,5,4,1).map(s-> s+"").distinct().collect(Collectors.toList());//distinct=중복된 배열 값 제외
		List<String> list2 = Stream.of(5,4,3,5,4,1).map(s-> s+"").collect(Collectors.toList());
	
		System.out.println(list2);
		
	}

	
}
