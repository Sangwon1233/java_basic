package lesson13_collection;

import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {
	//글자 빈도수 구하기
	public static void main(String[] args) {
		String str = "AAAAAAAAAABBBBBBCCCCCCDDDDDDDFFFFFFFFFFFFFFF";
		
		//목표
		//{A=6,
		Map<String, Integer> map = new TreeMap<>();
		String[] strs = str.split("");//문자열 배열
		for(String s : strs) {
			map.put(s,map.containsKey(s) ? map.get(s)+1 :1); //컨테인 키에 s을 들고있냐
			
		}
//		map.put(str.charAt(0)+"", 1); // charat를 써서문자열 만들기 
//		map.put(str.charAt(1)+"",map.get("A")+1 );
		System.out.println(map);
	}

}
