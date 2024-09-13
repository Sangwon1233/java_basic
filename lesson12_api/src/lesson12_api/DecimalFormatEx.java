package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {
	public static void main(String[] args) throws ParseException {//parse던지기
		//format : 원시데이터를 보고자하는 문자로 바꿈 원시>문자열
		//parse : 문자열>원시
		double[] scores = {99990.555,888888888.6666,700000.7777,60000.6666666,50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(double d : scores) {
			System.out.println(df.format(d));//더블을 스트링으로 바꿈
		}
		
	Number number=	df.parse("9,999,99"); 
	double dou= number.doubleValue();
	System.out.println(dou);
	
//	Number number1=	df.parse("9,ㅁ999,ㅇㄴ99"); //parse는 해석 가능한 것 까지 출력
//	double dou1= number1.doubleValue();
//	System.out.println(dou1);
		
	}

}
