package koreait.day5;

import java.util.Scanner;

public class MyDay5Test {
public static void main(String[] args) {
	int upper_cnt=0,lower_cnt=0,numeric_cnt=0,symbol_cnt=0,unsymbol_cnt=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("[[등록하실 비밀번호를 입력해주세요]]");
	String password=sc.nextLine();
	String msg ="";
	
	if(password.length()<8) {
		msg+="비밀번호는 8글자 이상어야 합니다";}
	for (int i = 0; i < password.length(); i++) {
		char temp = password.charAt(i);
	
	if(temp>='A'&&temp<='Z')
		upper_cnt++;
	else if(temp>='a'&&temp<='z')
		lower_cnt++;
	else if(temp>='0'&&temp<='9')
		numeric_cnt++;
	else if(temp =='>'||temp=='<'||temp=='('||temp==')'||temp=='%'||temp =='\\'||temp==';'||temp==' ') {
		
		unsymbol_cnt++;
	}
	else if (temp>=32&&temp<=47||temp>=':'&&temp<=64||temp>=91&&temp<=96||temp>=123&&temp<=126)
		symbol_cnt++;
	
}
System.out.println("대문자"+upper_cnt);
System.out.println("소문자"+lower_cnt);
System.out.println("숫자"+numeric_cnt);
System.out.println("사용가능 특수문자"+symbol_cnt);
System.out.println("사용불가 특수문자"+unsymbol_cnt);

	if(upper_cnt<1) {
		msg+="\n 비밀번호에 대문자가 포함되있어야합니다";
	}if(lower_cnt<1) {
		msg+="\n 비밀번호에 소문자가 포함되있어야합니다";
	}if(numeric_cnt<1) {
		msg+="\n비밀번호에 숫자가 포함되있어야 합니다";
	}if(symbol_cnt<1) {
		msg+="\n비빌번호에 특수문자가 포함되있어야합니다";
	}if(unsymbol_cnt>=1) {
		msg+="\n공백과 ><();%\\는 사용할수 없습니다";
	}if(password.length()>=8&&upper_cnt>=1&&lower_cnt>=1&&numeric_cnt>=1&&symbol_cnt>=1&&unsymbol_cnt==0) {
		msg+="사용가능한 비밀번호입니다";
	}System.out.println(msg);
	sc.close();
}  
}