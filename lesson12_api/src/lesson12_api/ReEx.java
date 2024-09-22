package lesson12_api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {//문자열 범위는 [-] ,[|] 사용 *는 문자열에대한 제한을 안건다
		Pattern pattern = Pattern.compile("b[a-z]*");//시작은b고정 그다음은 a~z의 소문자가 와야함
		Matcher m;
		
		m=pattern.matcher("bat");
		System.out.println("bat = "+m.matches());
		
		m=pattern.matcher("cat");
		System.out.println("cat = "+m.matches());

		m=pattern.matcher("bed");
		System.out.println("bed = "+m.matches());
		
		"bat".matches("b[a-z]*");//bat의 문자열이 b하고 a-z배열에 일치하냐?
		System.out.println("bed".matches("b[a-z]*"));
		
		//[0-9] 숫자 다
		//[^0-9] 숫자 배제하고 이게 \D랑 같다
		
		int[] arr = new int[5];
		arr[0] =1;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		System.out.println(list.size());
	}

}
