import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTimeDemo {
	public static void main(String[] args) {
		
		//시간 표시 방법 1) Date 를 이용하자.
//		Date now = new Date();
//		System.out.println(now); // now.toString() Wed Jul 17 11:08:54 KST 2024
		
		
		//시간 표시 방법 2) Calendar 를 이용하자.		
////		Calendar cal = new Calendar() ; // Calender는 추상클래스이기 때문에 new를 쓸 수 없다.
//		Calendar cal = Calendar.getInstance();
//		System.out.printf("오늘은 %d년 %d월 %d일 입니다. \n",
//				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)); //Calendar.DATE = Calendar.DAY_OF_MONTH

		
		//시간 표시 방법 3) GregorianCalendar 를 이용하자.			
//		Calendar cal = new GregorianCalendar(2024, 11, 25); //GregorianCalendar 의 부모가 Calendar
//		System.out.printf("금년은 %d년%n", cal.get(Calendar.YEAR));
		
		
		// 시간 표시 방법 4) DateFormat 을 이용하자.
//		DateFormat df = DateFormat.getDateTimeInstance(
//				DateFormat.FULL, DateFormat.MEDIUM, Locale.FRENCH);
//		System.out.println(df.format(new Date()));
		
		// 시간 표시 방법 5) SimpleDateFormat 을 이용하자.
//		String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
//		DateFormat df = new SimpleDateFormat(pattern); // DateFormat의 자식
//		System.out.println(df.format(new Date()));
		
		// 시간 표시 방법 6) printf 을 이용하자. 제일 간단. Formatter API 문서 확인 
		String pattern = String.format("오늘은  %1$tY년 %1$tm월 %1$td일 입니다.",new Date());
		System.out.println(pattern);
		
		
	}
}
