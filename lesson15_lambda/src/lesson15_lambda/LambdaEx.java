package lesson15_lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter<Integer> inter =

				t -> t * t;
		System.out.println(inter.m(10));
		
		MyInter<String> inter2 = s -> "hello !!" +s;
		System.out.println(inter2.m("새똥이"));
		
		Function<String, Integer> f = s -> Integer.parseInt(s);
//		Function<String, Integer> f =s -> Integer::parseInt(s);
		
		int result = f.apply("1234");
				System.out.println(result + 1000);
				
				Object o = new MyInter<Integer>() {

					@Override
					public Integer m(Integer t) {
						// TODO Auto-generated method stub
						return null;
					}
					
				};
				
		Object o2 = (MyInter<String>)(s -> s);
	}

}

@FunctionalInterface // 추상메서드는 딱 하나만 있어야함,인터페이스의 접근제한자는 모든게 퍼블릭
interface MyInter<T> { //직접만들기
	T m(T t);

	default T m2(T t) { // default는 구상 메서드
		return t;
	}
}
