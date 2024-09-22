package lesson12_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		Integer i1 = 10; //기본자료형
		Integer i2 = new Integer(20); //boxing
		Integer i3 = new Integer("30");//boxing
		
		System.out.println(i1+i2+i3); //unboxing
		
		
		Integer i4 = 20;
		System.out.println(i2== (i4));//참조형으로 인식해서 틀리다고 나옴
		System.out.println(i2.equals (i4));
		
		System.out.println(i2.intValue()==i4.intValue());//int로 변환해서 비교하기
		
		
		Long l1 = 10L;//L을 써줘야지 박싱가능
//		Long l1 = 10; 이거는 안들어감
		Long l2 = i1.longValue();
		
		
		Character c1 =65;

		//문자열 > wrapper 객체
		l2=Long.valueOf("10");
		l2=new Long("10");
		
		//wrapper > 문자열	
		String str = l2+ "";
		str = l2.toString();//l2가 널일때만 동작안함
		
		//기본형 > wrapper
		l2=Long.valueOf(10L);
		l2=10L;//이렇게 해도됨
		
		//wrapper> 기본형
		long l3 = l2.longValue();
		
		//기본형 > 문자열
		str = String.valueOf(l3);
		
		//문자열 > 기본형
		l3=Long.parseLong(str);
		
	//더블타입으로 바꾸기
		double d = Double.parseDouble(str);//더블타입으로 바뀜
		
		Integer.parseInt("FF",16); //16진수로 표현해라
		System.out.println(Integer.toBinaryString(255));//2진수로 나오게하기
		System.out.println(Integer.toOctalString(255));//8진수
		System.out.println(Integer.toHexString(255));//16진수
		
		int i =0XFF;
		char ch = 0xAC00;
		char ch2 = '\uAC00'; //아스키코드에서 \a를 앞에 붙이면 16진수로 바뀜
		System.out.println(ch);
		System.out.println(ch2);

		
		
		
	
		
		
		
	}

}
