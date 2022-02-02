package koreait.day7;

import java.util.Scanner;

public class TodayQuestion {
public static void main(String[] args) {
	String src_string;String even_string=""; String odd_string="";
	//작성자-정다산		//연산식에 사용될 변수는  꼭 초기화 !!!
	System.out.println("문자열(공백과 기호,숫자 포함)을 입력하세요.");
	Scanner sc =new Scanner(System.in);
	src_string=sc.nextLine();
	
	//String.charAt()사용
	for (int i = 0; i < src_string.length(); i++) {
		if(i%2==0) {
			even_string+=src_string.charAt(i); 
		}else  {
			odd_string+=src_string.charAt(i);
		}
	}
	System.out.println("[[결과]]");
	System.out.println("짝수문자열:"+even_string);
	System.out.println("홀수문자열:"+odd_string);
	//char[]사용
	char msg[]; even_string="";  odd_string="";
	msg=src_string.toCharArray();
	for (int i = 0; i < msg.length; i++) {
		if(i%2==0) {
			even_string+=msg[i];
		}else  {
			odd_string+=msg[i];
		}
	}
	System.out.println("[[결과]]");
	System.out.println("짝수문자열:"+even_string);
	System.out.println("홀수문자열:"+odd_string);
	
	sc.close();
}
	
	
}
