package lesson13_collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
//		List<Object> list = new ArrayList<>(); //object의 타입을 받겠습니다.
		List<Integer> list = new ArrayList<>(); //Integer의 타입을 받겠습니다. 이제부터 모든 타입은 Integer
		list.add(1);
		//add의 횟수만큼 사이즈가 변동된다
		System.out.println(list);
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		int sum=0;
		
		for(int i =0; i<list.size();i++) {
			System.out.println(i+ "::"+list.get(i));
//			sum+= (Integer)(list.get(i));//오브젝트를 int로 변환
			sum += list.get(i);
//		//여기서 메소드는 add,size,get이 있다
		}
		System.out.println(sum);
	}
}
