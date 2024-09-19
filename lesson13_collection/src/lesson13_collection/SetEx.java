package lesson13_collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		
		set.add("가");//add는 중복때문에 못들어가면 펄스가 나옴
		set.add("나");
		System.out.println(set.add("마"));
		set.add("라");
		set.add("다");
		System.out.println(set.add("라"));
		set.add("라");
		set.add("라");
		set.add("라");
		
		
		System.out.println(set);
		
	}

}
