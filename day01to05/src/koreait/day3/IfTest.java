package koreait.day3;

import java.util.Scanner;

public class IfTest {//boolean 자료형과 관계연산을 이용한 조건제어 연습
public static void main(String[] args) {
	//if 문의 형식1 : if(    ){     A    }else {       B        }
	//A 는 조건관계식이 참일때 실행하는 명령문들
	//B 는 조건관계식이 거짓일때 실행하는 명령문들
	// A,B 가 명령문이 1개 일때는 {}생략합니다.
	
	Scanner sc =new Scanner(System.in);
	int point;
	
	System.out.println("포인트를 입력하세요. ->");
	point =sc.nextInt();

	System.out.print("회원등급:");
	if(point>=100) System.out.println("VIP");
	else
		System.out.println("일반회원");
	
	
	//point가 70 이상이면 +100을 추가 적립,70 미만이면 110을 추가 적립
	//point가 70이상일때 "감사합니다" 70미만이면 "또 오세요"
	//실행할 명령이 2문장 이상일때  {} 사용
	if(point>=70) {
		//point+=100;
		System.out.println("감사합니다.(●'◡'●)(●'◡'●)");
	}else {
		//point+=110;
		System.out.println("또 오세요");
	}System.out.println("현재 포인트:"+point);
	
	
	
	
	
	
	
	
	
	
	
}
}
