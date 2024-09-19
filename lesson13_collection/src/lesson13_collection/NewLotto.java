package lesson13_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NewLotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size() < 6 ) {//set에 로또번호가 들어감
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		//개별 탐색
		//1.향상 for
		for(Integer i :set) {
			System.out.println(i -1);
			
		}
		//2.iterator로 변경
		Iterator<Integer> iter =set.iterator();
//		iter.next(); 커서내용을 옮겨가면서 한개씩 리턴하는것
//		iter.hasNext(); 다음 주소를 알고있냐 물어보는 것 모르면 다음이 없는것
		while(iter.hasNext()) {
			System.out.println(iter.next()-1);
			
		}
	}

}
