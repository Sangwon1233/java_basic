package lesson13_collection;

import java.util.TreeSet;

public class NewLotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size() < 6 ) {//set에 로또번호가 들어감
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}

}
