package koreait.day4;

import java.util.Scanner;

public class StringTest {
public static void main(String[] args) {//문자열 다루는 클래스 String을 연습
	//문자열을 변수로 지정하고싶다 그러나 문자열은 int ,double처럼 기본형식이 없고 클래스가 있음

	//name 변수는 int.double처럼 기본형타입이 아니코 클래스타입(참조타입) 변수 입니다.
	String name= "Kim";//name 변수의 타입은 String(클래스)
	System.out.println("name ="+name);//문자열 +연산은 문자열과의 연결연산입니다
	name ="Choi";
	System.out.println("name ="+name);
	
	
	//String 타입의 객체로 실행하는 메소드
	System.out.println(name.length());		//4		->int 타입반환 ,문자열의 크기
	System.out.println(name.charAt(0));		//c		->char 타입반환, 지정된위치의 문자		
	System.out.println(name.charAt(1));		//h
	System.out.println(name.charAt(2));		//o
	char result =name.charAt(3);		//char반환값 저장을 위한 변수 선언
	System.out.println(result);				
	System.out.println(name.equals("kim"));		//false ->불린 타입 반환, name 이 참조하는 문자열과 kim이 같은지 비교
	System.out.println(name.equals("choi"));	//true
	
	//문자열 입력
	Scanner sc =new Scanner(System.in);
	String nickname; //STring타입의 객체 즉 문자열은 참조하는 변수 ->nickname
	nickname= sc.nextLine();//키보드로 입력받은 문자열을 메모리에 저장하고 그 주소를 nickname이 참조 합니다
	
	//next 메소드는 공백 또는 앤터 이전까지만 저장
	//nextline 메소드는 엔터 이전까지 저장
	System.out.println("nickname="+nickname);
	System.out.println("nickname length="+nickname.length());
	System.out.println("nickname equals=" +nickname.equals("James"));
	System.out.println("일부 추출="+nickname.substring(4));//위치 4부터 긑까지
	System.out.println("일부 추출="+nickname.substring(4,6));//위치 4부터 6이전까지(6은 포함 안함)
	sc.close();
	
	
	
	
	
}
}
