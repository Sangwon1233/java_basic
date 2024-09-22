package lesson12_api;

import static java.util.Calendar.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//1.저번달
//2.다음달
//3.작년 9월
//4.내년 9월
//5.년도 월 검색시 달력 출력
//6.종료
public class CalrendarHw {
	public static void main(String[] args) {//달력은 년도와 월이 중요하다
		
//		Calendar cal = Calendar.getInstance();//인스턴스 생성,년도값은 캘린더 인스턴스에 저장되어있음
//		//연,월 ,마지막 날짜,1일의 요일
//		cal.set(Calendar.MONTH, 5);
//		
//		
//		
////		int year = cal.get(Calendar.YEAR);
////		int month = cal.get(Calendar.MONTH);//8
//		printCal(cal);
//		while(true) {
//			System.out.println("1.이전달 2.다음달 3.이전해 4.다음해 5.달 지정");
//		switch(Scanner.nextInt()){
//		case 1:
//			cal.add(Calendar, MONTH,-1);
//			break;
//			
//			default:
//				
//				break;
//				
//		}
//		printCal(cal);
//		}
//	}
//	
//		
//	static void printCal(Calendar cal) {
//		System.out.println(cal.get(Calendar.YEAR));
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		cal.set(Calendar.DATE, 1);//1일이 몇번째 요일이냐
//		int startDay = cal.get(Calendar.DAY_OF_WEEK);
//			// 1 2 3 4
//		
//		for(int i = 1 - startDay + 1 ; i <= lastDate; i++) {
//			if(1>0) {
//				System.out.printf("%4d", i);
//			}
//			else {
//				System.out.print("       ");
//			}
//			
//			if(i % 7 ==(7 - startDay + 1) % 7) {
//				System.out.println();
//			}
//		}
//	}
//	
//}
//		
//		
		
		
		
		
		
		
		Calendar cal =new GregorianCalendar();
		
		System.out.println(cal.get(MONTH)+1);//0부터 
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(DAY_OF_WEEK));//요일의 숫자
		

		
		while(true) {
				int input = CalrendarUtils.nextInt("1.저번달 2.다음달 3.이전 해 4.다음 해 5.날짜 검색 6.종료");
				switch (input) {
				case 1:
					cal.set(MONTH, cal.get(MONTH)-1); //저번달이라서 -1
					CalrendarUtils.CalrendarP(cal);
					break;
				case 2:
					cal.set(MONTH, cal.get(MONTH)+1);//다음달이라서 +1
					CalrendarUtils.CalrendarP(cal);
					break;
				case 3:
					cal.set(YEAR, cal.get(YEAR)-1);//이전 해 오늘을 불러오느라 -1
					CalrendarUtils.CalrendarP(cal);
					break;
				case 4:
					cal.set(YEAR, cal.get(YEAR)+1);//다음 해 오늘을 불러와서 +1
					CalrendarUtils.CalrendarP(cal);
					break;
				case 5:
					int syear = CalrendarUtils.nextInt("검색 할 년도를 입력하세요");//유틸에서 입력받아서 syear에 담는다
					int smonth = CalrendarUtils.nextInt("검색 할 월를 입력하세요");//유틸에서 입력받아서 month에 담는다
					cal.set(syear, smonth-1,1);//담는 년도 담는 월-1,1일부터 
					CalrendarUtils.CalrendarP(cal);	//내가만든 메소드 호출
					break;
				case 6 :
				System.out.println("달력을 종료합니다.");
					return ; //6값을 입력시 반환하여 달력을 종료 
				default: //입력값이 없을때
					break;
				}
		
		
		}

	}
}
