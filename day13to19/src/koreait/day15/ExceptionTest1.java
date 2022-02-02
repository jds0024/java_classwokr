package KoreIt.day15;

import java.util.Scanner;

public class ExceptionTest1 {
public static void main(String[] args) {
	//Exceptiom 요약: 문법오류가 아닙니다.실행하면서 발생하는 오류입니다(발생가능성을 고려해서 프로그래밍 해야합니다)
	//  ->원인에 따라 다른이름xxxxxException이 발생하고 이들은 Exception클래스의 자식클래스 입니다
	//	->Exception 이 실행중에 발생하면 그 이후 프로그램자체가 그 시점부터 중단됩니다
	//		따라사, Exception을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다
	
	
	//Exception 예시4:Wrapper 클래스 (Short,Integer,Double,Long...)에는 문자열을 기본형타입으로 변환하는 메소드가 있다
	//int b=Integer.parseInt("abc");//Integer.parseInt("123"); ->정상실행
			//정수로 변환할 수 없는 문자열은NumberFormatException이 발생합니다
	//System.out.println("b="+b);
	
	double c =Double.parseDouble("123,456,000.123");//Double.parseDouble("1234.567"); ->정상적으로 실행
	System.out.println("c=="+c);
	
	
	
	//Exception 예시3
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
			// 사용자 입력한문자에 숫자외에 것이 있을때 InputMismatchException
	
	
	//Exception 예시2
	int [] nums=new int[5];
	nums[5]=100;	//실행했을때ArrayIndexOutOfBoundsException 발생 ->인덱스 0~4
}
	//Exception 예시1
	String message = null;
	
	char temp=message.charAt(0);
	//실행했을 때 NullPointerException 이 발생합니다 ->이유 :message 참조 객체가 null이기 때문입니다
	
}
