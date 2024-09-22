package lesson13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A",1);
		map.put("B",1);
		map.put("C",1);
		map.put("C",2);//덮어 씌운다
		System.out.println(map);
		System.out.println(map.get("D"));//널값이 나옴	
		System.out.println(map.get("A")+3);
		System.out.println(map.size());
		
		System.out.println(map.containsKey("D"));
		System.out.println(map.containsValue(1));
	
		
		//탐색
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		for( Map.Entry<String, Integer> entry : entries){
			System.out.println(entry.getKey()+ "::"+entry.getValue());
		}
		
		Set<String>keys =map.keySet();
		System.out.println(keys);
		for( String key: keys) {
			System.out.println(key + "::" + map.get(key));//키가 중복 보장을하니 c가 덮어 씌워져서 나옴
		}
		
		Collection<Integer>	collection =  map.values();
		System.out.println(collection);
		
		List<Integer> list = new ArrayList<Integer>(collection);//중복을 허용
		Set<Integer> set = new HashSet<Integer>(collection);//중복을 불허
		
		System.out.println(list);
		System.out.println(set);
	}

}
