package koreait.day3;

import java.util.Scanner;

public class BooleanTest {//boolean자료형 연습
	//boolean 자료와 관련된 주요 연산은 관계연산(비교)입니다.
	//->관계연산자 :>,<,>=,<=,==,!=
	// ->관계 연산의 결과는? true.false
public static void main(String[] args) {
	
	boolean result;  //true 또는 false 가 저장

	result = 10 > 5;
	System.out.println(result);
	
	result = 10 != 10;
	System.out.println(result);
    	
	int data;
	Scanner sc =new Scanner(System.in);
	
	System.out.print("비교할 값 입력>>>");
	data =sc.nextInt();
	//boolean 출력은 %s
	System.out.printf("비교 결과 data>=50:%s\n",data>=50);
	
	
	
	//응용: 입력된  data  값이 50보다 작으면 포인트를 50을 적립해준다
	//						50보다 크거나 작으면 10을 적립해준다
	
	
	
	
	
	
	
	
	
	
	
	
	
	
      }
}
