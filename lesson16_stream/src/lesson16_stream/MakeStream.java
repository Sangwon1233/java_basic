package lesson16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		//배열로 스트림 만들기 ,스트림은 1회성 소비 객체이다
		String[] strs = {"가","나","A","B"};
		Stream<String>stream= Arrays.stream(strs);
//		System.out.println(stream);
		stream.forEach(System.out::println);//더블클론을 이용해서 창조한다
		stream= Arrays.stream(strs,1,3);//스트림은 1회성 소비 객체라서 한번더 객체 생성을 한다 ,1번이랑 3번을 이용해서 출력
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		//리스트로 스트림 만들기
		List<String>list =new ArrayList<String>(Arrays.asList(strs));
		stream =list.stream();
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		
		//셋으로 스트림 만들기
		stream = new HashSet<>(list).stream(); //hashset이라 순서가 뒤죽박죽으로 나옴
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		//빌더 패턴으로 스트림 만들기
		stream = Stream.builder().add("새똥이").add("길동이").add("소똥이").build().map(o -> o.toString());
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		//제네레이트 스트림 만들기
		stream =Stream.generate(()-> "애국가").limit(10);//갯수 지정을 해야함 안그러면 무한대로 나옴 컴터터짐 조심
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		//iterate 스트림 만들기
		stream = Stream.iterate("A", s ->(char) (s.charAt(0)+1)+ "").limit(26);
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		//of 사용으로 스트림 만들기
		stream =Stream.of("가","길동이","새똥이");
		System.out.println("===============================");
		stream.forEach(System.out::println);
		
		
		
		
		
	}
}
