package koreaIt.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
	//날짜와 시간형식을 다루는 자바 클래스를 연습합니다
	//1.java.util.Date 클래스 2)java.util.Calendar클래스
	//3.java8 버전에서 LocalDate(날짜),LocalTime(시간),LocalDateTime(날짜와 시간)클래스
public static void main(String[] args) {
	
	LocalDate currentDate=LocalDate.now(); 	
	System.out.println("날짜 확인:"+ currentDate);
	
	LocalTime currentTime =LocalTime.now();
	System.out.println("시간확인:"+currentTime);
			
	LocalDateTime current =LocalDateTime.now();
	System.out.println("날짜와 시간 확인:"+current);
	
	//임의 날짜 또는 시간으로 객체를 생성
	LocalDate mybirth =LocalDate.of(2000, 01, 27);
	System.out.println("내 생일 날짜 확인:"+mybirth);
	
	LocalTime mybirth_time =LocalTime.of(01,50);
	System.out.println("내 탄생 시간 확인:"+mybirth_time);
	
	//현재 날짜로 부터 5일후를 계산
	int day=5;
	System.out.println("오늘 날짜+"+day+"일은"+currentDate.plusDays(day));
	day=30;
	System.out.println("오늘 날짜-"+day+"일은"+currentDate.minusDays(day));
	
	//내가 태어난지 몇일이 지났는지(날짜 사이의 간격 계산)
	Period between = Period.between(mybirth, currentDate);
	
	System.out.println("내가 태어난지"+between.getYears()+"년");
	System.out.println("내가 태어난지"+between.getMonths()+"개월");
	System.out.println("내가 태어난지"+between.getDays()+"일");
	
	long test =ChronoUnit.DAYS.between(mybirth, currentDate);
	System.out.println("test ="+test);
	
	test =ChronoUnit.YEARS.between(mybirth, currentDate);
	System.out.println("test ="+test);
	
	//Duration 클래스:시간간격 계산할때 사용 메소드 있습니다
	//ChronoUnit 	:시분초년월주일 단위로 모두 사용할 메소드 있습니다
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
}
}
