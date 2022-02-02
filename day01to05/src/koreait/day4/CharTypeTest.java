package koreait.day4;

import java.util.Scanner;

public class CharTypeTest {
public static void main(String[] args) { //char ascii코드값을 분류 합니다(대문자 ,소문자,숫자, 특수기호)
	//Scanner로 키보드 입력할때 문자 입력은 없다
	int ch1;
	Scanner sc = new Scanner(System.in);
	System.out.print("알고싶은 아스키코드 정수값 입력하세요. ->");
	
	ch1=sc.nextInt();
	
	char ch2 = (char)ch1;
	
	// 요구사항 :정수 값에 해당하는 문자 출력하기.문자 분류결과 출력하기
	
	if(ch2>='A'&&ch2<='Z') //A~Z범위검사
		System.out.println("분류:대문자,입력한 아스키코드값문자:"+ch2);
	else if(ch2>='a'&&ch2<='z')//a~z 범위검사
		System.out.println("분류:소문자,입력한 아스키코드값문자:"+ch2);
	else if(ch2>='0'&&ch2<='9')//0~9 범위검사
		System.out.println("분류:숫자,입력한 아스키코드값문자:"+ch2);
	else if(ch2>=32&&ch2<=47||ch2>=':'&&ch2<=64||ch2>=91&&ch2<=96||ch2>=123&&ch2<=126)
		System.out.println("분류:특수기호,입력한 아스키코드값문자:"+ch2);
	
	
	
	else
		System.out.println("분류:없음, 알수 없는 문자,알 수 없는 문자:"+ch2);
	sc.close();
	
	
}
}
