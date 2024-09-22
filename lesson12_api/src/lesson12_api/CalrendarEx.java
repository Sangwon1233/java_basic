package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;



public class CalrendarEx {
	public static void main(String[] args) {
		Calendar cal =new GregorianCalendar();
//		Calendar cal2 =  Calendar.getInstance();
		
		Date date = new Date(cal.getTimeInMillis());//
		date.setTime(cal.getTimeInMillis());
		
		
		cal.setTimeInMillis(date.getTime());
		
		//cal.getActualMaximum() 달의 마지막 날 구하기
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.get(ERA));//기원전
		System.out.println(cal.get(MONTH)+1);
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(DAY_OF_MONTH));
		
		cal.set(DATE, 15);//날짜를 15로 바꿔라
		
		System.out.println(cal.get(DAY_OF_WEEK));//한 주의 시작 찾기
		System.out.println(cal.get(DAY_OF_WEEK_IN_MONTH));//위 날짜 토요일이 몇번째 토요일인가
		System.out.println(cal.get(ZONE_OFFSET) /1000 /60 /60);//gmt 9는 한국시간 ms로 나옴 (괄호 밖에서 해야됨 안에서 하게되면 상수값을 나눔)
		
		}

}
