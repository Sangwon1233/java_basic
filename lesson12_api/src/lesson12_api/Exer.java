package lesson12_api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;



public class Exer {
	public static void main(String[] args) throws MalformedURLException {
		// 달력 출력 (최소 이번달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력시 해당 연월 달력 출력
		
		// URL분석(String class 사용)
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		// 1. 프로토콜
		// 2. 도메인 search.naver.com
		// 3. 파일네임 search.naver
		// 4. 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
		// where :: nexearch
		// sm :: top_hty
		
		// 현재 위의 문자열은 5쌍의 key, value
		
//		String tmp ="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
//		int idx = tmp.indexOf("/")+1;
//		System.out.println(idx);
//		System.out.println(tmp.substring(0, idx+1));
//		tmp=str.substring(idx+1);
//		
//		
//		idx=tmp.indexOf("/");
//		System.out.println(tmp.substring(0,idx));
//		tmp=tmp.substring(idx+1);
//		System.out.println(tmp);
//		
//		idx=tmp.indexOf("?");
//		System.out.println(tmp.substring(0,idx));
//		tmp=tmp.substring(idx+1);
//		
//		System.out.println(tmp);
//		
//		System.out.println(Arrays.toString(str.split("&")));
//		String[] rep = tmp.split("&");
//		for(int i = 0;i< rep.length;i++) {
//		System.out.print("key ::: " + rep[i].substring(0, rep[i].indexOf('=')));// 하나만 있으면 =부터 뒤쪽까지 출력하겠다.
//		System.out.println("   value ::: " + rep[i].substring(rep[i].indexOf('=') + 1));
//		}
//	}
//}
//	
//		
//		
		
//		}
//	String tmp ="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
//	int idx=tmp.indexOf("/");
//	System.out.println(tmp.substring(0,idx+2));
//	tmp = str.substring(idx);
//
//	idx=tmp.indexOf("");
//	System.out.println(tmp.substring(0,idx));
//	tmp = tmp.substring(idx);
	
		//
	MYUrl myurl = new MYUrl(str);
//	System.out.println(myUrl);
	myurl.print();
//	System.out.println(url.getProtocol());
//	System.out.println(url.getHost());
//	System.out.println(url.getPath());
//	System.out.println(url.getQuery());
	//1.프로토콜
	}
}
	
	
	class MYUrl{
		String protocol;
		String domain;
		String fillename = "";
		String[] queryString;
		
		public MYUrl(String url) {
			String str =url;
			protocol = str.substring(0,str.indexOf("://"));
			str = str.substring(str.indexOf("://")+3);
			
			//domain 초기화
			int idx= str.indexOf("/");
			if(idx<0) {
			domain = str;		
			}	
			else {
			domain=str.substring(0,idx);
			str =str.substring(idx+1);		
			}			
			//filename 초기화
			System.out.println(str);
			idx = str.indexOf("?");
			if(idx<0) {
				fillename = str;
				return;
				}	
			fillename =str.substring(0,idx);
			str= str.substring(idx+1);
			if(str.length()==0) {
				return;
			}
			System.out.println(str);
			
			
			//querySting 초기화
			queryString = str.split("&");
				
	
		}

//		@Override
//		public String toString() {
//			return "MYUrl [protocol=" + protocol + ", domain=" + domain + ", fillename=" + fillename + ", queryString="
//					+ Arrays.toString(queryString) + "]";
//			
//		}
		public void print() {
			System.out.println("protocol=" + protocol + ", domain=" + domain + ", fillename=" + fillename );
			System.out.println(Arrays.toString(queryString));
			for(String qs :queryString) {
				String[] tmp= qs.split("=");
				System.out.println(tmp[0]+"::: "+(tmp.length> 1 ? tmp[1] : ""));
			}
		}	

	}
	
		

	



