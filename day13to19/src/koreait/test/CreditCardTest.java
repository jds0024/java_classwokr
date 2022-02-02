package test;

import koreaIt.day16.KakaoMini;
import koreaIt.day16.KakaoVIP;

public class CreditCardTest {
public static void main(String[] args) {
	KakaoMini mini =new KakaoMini("모모");
	System.out.println("현재 한도:"+mini.getLimit());
	mini.upLimit(50000);
	System.out.println(mini);	
	
	KakaoVIP vip=new KakaoVIP("사나", 2000000);
	System.out.println(vip);
	
	System.out.println("\n모모 학생이 점심 돈까스 금액 5000원 사용");
	if(mini.pay(5000)==0)
   	 System.out.println("한도초과입니다");
    else {
   	System.out.println( "결제 승인완료");
    };System.out.println(mini);
	
    System.out.println("\n사나가 스마트워치 구매 : 금액 50만원");
	vip.pay(500000); System.out.println(vip);
	
	System.out.println("\n사나가 냉장고 구매 : 금액 550만원");
     vip.pay(5500000); System.out.println(vip);
    
     System.out.println("모모 학생이 스마트폰 구매 : 금액 20만원");
     if(mini.pay(200000)==0)
    	 System.out.println("한도초과입니다");
     else {
    	System.out.println( mini.pay(200000)+"원 결제 되었습니다");
     }
     System.out.println(mini);
     
     
     
	

	

	
}
}
