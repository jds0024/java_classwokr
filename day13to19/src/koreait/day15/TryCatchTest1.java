package KoreIt.day15;

import java.util.Scanner;

public class TryCatchTest1 {
	//형식: try{..월래 해야할 명령들..}catch(){..Exception발생시 해야할 명령들}
	// 실행중에 잘못된 값으로 발생하는 오류(Exception)를 처리합니다
	public static void main(String[] args) {
	try {
		//테스트 2
		String message =null;
		char temp=message.charAt(0);
		
		//테스트 1
		Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
		System.out.println("a="+a);//Exception가능성있음.
	}catch(NullPointerException e1) {//NullPointerException발생시에만 처리되는 {}입니다
		System.out.println("NULL 참조");
		
	} catch (Exception e) {		//Exception 이 발생한 오류 정보를 객체로 관리하고  참조변수는 e
		//NullPointerException제외하고 다른 Exception 발생시 처리되는 {}입니다.
		System.out.println("잘못된 입력입니다.");
	}		//catch절은 여러반 작성할 수 있다
		
		System.out.println("프로그램 끝..");
		
	}

}
