package koreait.day7;

import java.util.Scanner;

public class UpperLowersString {
public static void main(String[] args) {
	String message,upper,lower;
	char[] uppers =new char[20];
	char[] lowers =new char[20];
	int k=0;
	int j=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("문자열을 입력해주세요(단, 영문자만)");
	message=sc.nextLine();
	for ( int i=0; i< message.length(); i++) {
		if('A'<=message.charAt(i)&&message.charAt(i)<='Z') {
			uppers[k]=message.charAt(i);
			k++;
		}else if('a'<=message.charAt(i)&&message.charAt(i)<='z') {
			lowers[j]=message.charAt(i);
			j++;
		}else {System.out.println("영문자만 입력 가능합니다");}
		}
	upper=String.valueOf(uppers);
	lower=String.valueOf(lowers);
	System.out.println(upper);
	System.out.println(lower);
	sc.close();
	

}}