package koreaIt.day16;

import java.text.DecimalFormat;

public class CurrentTimeTest {

		public static void main(String[] args) {
			
			System.out.println(System.currentTimeMillis());
			
			long start=System.currentTimeMillis(); //ms:0.001초,us:0.000001초 ns:0.000000001초
			System.out.println(start);		//1970년 1월1일 0시기준 .guswo 2022년 1월1일 0시 시간차 23년
			
			long result=52L*365L*24L*60L*60L*1000L;
			System.out.println(result);
			
			//1년은 몇 ms 일가요?
			System.out.println("1년은"+result/52+"ms 입니다.");
			System.out.println("1일은"+result/(52*365)+"ms 입니다.");
			
			DecimalFormat df= new DecimalFormat("###,###,###,###");
			long t1 =result/52;
			long t2 =result/(52*365);
			
			System.out.println("1년은"+df.format(t1)+"ms 입니다");
			System.out.println("1일은"+df.format(t2)+"ms 입니다");
			
			
		}
}
