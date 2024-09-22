package lesson16_stream;

import java.util.stream.Stream;

public class FillterStream {
	public static void main(String[] args) {
 	Stream<String> stream = Stream.of("홍길동","김유신","홍길동","이순신","홍길동","유관순");
 	
 	stream
 	.distinct() //중복 삭제(중간연산)
 	.filter(s->s.startsWith("홍"))// 이거하면 홍길동만나옴 (필터 중간연산)
 	.forEach(System.out::println);// 최종연산 연산 끝
 	
 	
	}

}
