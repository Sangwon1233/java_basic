package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalrendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.add(Calendar.DATE, -10000);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.add(Calendar.MONTH, 200);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		cal.roll(Calendar.DATE, 4);//롤을 사용하면 날짜만 바뀌고 시간은 고정시킬수있다?
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		
		
	}

}
