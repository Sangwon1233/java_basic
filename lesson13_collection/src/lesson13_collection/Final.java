package lesson13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Final {
	public static void main(String[] args) {
		//Arrays(배열)
		List<Integer> list =new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(list.get(2));
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(4));
		
		Integer[] arr = {1,2,3,4,5,6,7,8};
		list = Arrays.asList(arr);
		
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		//Colletions
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list); //list의 sort는 comperator필요한데 collections은 안필요함
		System.out.println(list);
		Collections.reverse(list);//역순으로 출력
		System.out.println(list);
	
	}

}
