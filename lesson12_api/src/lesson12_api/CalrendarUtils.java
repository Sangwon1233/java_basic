package lesson12_api;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalrendarUtils {

static Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {
		System.out.println(msg);
		System.out.print("> ");
		return scanner.nextLine();
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
		
		
	}
	public static void CalrendarP(Calendar cal) { //
		cal.set(DATE, 1); //날짜는 1부터
		int startDay=cal.get(DAY_OF_WEEK); //시작하는 날을 스타트 데이에 담는다
		int lastDay = cal.getActualMaximum(DAY_OF_MONTH);//달에 마지막
		int cnt=startDay;//시작 일을 cnt에 담는다

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월");//떙떙 년- 떙떙 월
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		System.out.println("일  월  화  수  목  금  토");
		
		for(int i=1;i<startDay;i++) {//1일부터 스타트 데이까지 공백을 출력
			System.out.printf("%3c", ' ');
		}
		
		for(int i=1;i<=lastDay;i++,cnt++) {//라스트데이까지 같거나 작을떄까지 증가
			System.out.printf("%3d", i);//공백을 %3만큼하고 날짜를 출력
			if(cnt == 7) { //7번 출력하면
				System.out.println();
				cnt = 0; //0으로 초기화
			}
	}
		System.out.println();
	
	}
}
