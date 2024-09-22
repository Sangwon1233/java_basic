package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(100));
//		System.out.println(str.charAt(-3));
		
		
		System.out.println(str.equals(new String("abcdeabcde")));

		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b",3));
		System.out.println(str.lastIndexOf("b"));
		System.out.println(str.lastIndexOf("b",3));
		
//		substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
		
//		첫번째 만나는 "c"문자열에서 마지막 만나는 "d"문자열까지 문자열 자르기	
		System.out.println(str.substring(str.indexOf("c"),str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase().toLowerCase());//전부 대문자로 바꾸기,전부 소문자로 바꾸기
		
		String s= "              [ 안녕하세요 ]              ";
		System.out.println(s.trim().replace("", ""));//빈문자를 공백으로 
		
		System.out.println(str.endsWith("cde"));//어떤걸로 끝나는가
		System.out.println(str.endsWith("cd"));
		
		System.out.println(str.replace("a", "f"));//a를 전부 f를 바꿔라
		System.out.println(str.replaceFirst("a", "f"));//첫번째 a 하나를 f로 바꿔라
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));//비 기준으로 짜름

		
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("ace"));//첫번째 비교후 다음자리 비교값이 나옴 같을시 또 다음으로
		System.out.println("abc".compareTo("aae"));
		System.out.println("");
		
	
		
		
	}	

}
