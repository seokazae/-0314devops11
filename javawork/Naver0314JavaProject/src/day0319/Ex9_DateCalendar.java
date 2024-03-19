package day0319;

import java.util.Calendar;
import java.util.Date;

public class Ex9_DateCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date 클래스를 이용해서 년월일시분초 얻기
		//(JDK1.1이후 Deprecate 되고 Calendar를 권장하나 여전히 많이 사용)
		Date date=new Date();//디폴트로생성시 현재날짜와 시간을 얻는다
		int year=date.getYear()+1900;//년도는 1900이 빠진값
		int month=date.getMonth()+1;//0~11이 반환
		int day=date.getDate();
		int week=date.getDay();//요일(0:일 2:화 6:토)
		int hour=date.getHours();
		int min=date.getMinutes();
		int sec=date.getSeconds();
		
		
		System.out.println("현재년도"+year);
		System.out.println("현재월"+month);
		System.out.println("현재일"+day);
		System.out.println("현재요일"+week+"("+
			(week==0?"일":week==1?"월":week==2?"화":week==3?"수":week==4?"목":week==5?"금":"토")+")");
		System.out.printf("%d시 %d분 %d초\n",hour,min,sec);
		System.out.println("=".repeat(30));
		System.out.println("Calendar 를 이용하여 출력하기");
		
		Calendar cal=Calendar.getInstance();//생성자가 public이 아니라서 new로 생성불가
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH)+1;//0~11 반환
		day=cal.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일입니다\n",year,month,day);
		
		
		
	}

}
