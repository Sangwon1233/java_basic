package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is =IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);
		
		List<Integer> list = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		System.out.println("========================================");
		
		LongStream ls = new Random().longs(6, 1, 46).sorted();//sorted를 쓰면 정렬이됨
		ls.forEach(System.out::println);
		System.out.println("========================================");
		
		IntBinaryOperator ibo = Math::max;
		
		Function<String, Integer> f = Integer::parseInt; //문자을 인티저함수로 변환하기
		
//		BinaryOperator<String> bo =(x,y) -> x.concat(y); //concat은 더하기
		BinaryOperator<String> bo =String::concat;
		System.out.println("a".concat("b"));
		System.out.println("========================================");
		
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new; //생성자 참조
		
		is = "가나다라ABCD".chars();
		is.forEach(s -> System.out.println((char)s)); //문자 하나당 출력하기
		
//		Comparator<String> com = (x, y) -> x.compareTo(y);
		Comparator<String> com = String::compareTo;
		
	}
}
