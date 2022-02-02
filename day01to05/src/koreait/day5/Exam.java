package koreait.day5;

import java.util.Scanner;

public class Exam {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String tempword;
	int upper_cnt=0,lower_cnt=0,numeric_cnt=0,symbol_cnt=0;
	boolean isOk=false;	//pasword규칙에 맞는지 논리값 저장
	boolean isUseless=true;
	String msg="";   //pasword  규칙 불만족 조건 메시지
	
	//연산에 사용되는 변수는 반드시 초기값을 저장한다
	
	System.out.println("[[사용자 패스워드 검사]]");
	System.out.println("사용할 패스워드를 입력하세요");
	tempword=sc.next();
	if(tempword.length()<8) {
		msg="1) 8글자 이상이어야한다.";
	}
	for (int i = 0; i < tempword.length(); i++) {
		char temp =tempword.charAt(i);
		if(temp>='A'&&temp<='Z')
			//대문자 개수 증가
			upper_cnt++;
		else if(temp>='a'&&temp<='z')
			//소문자 개수 증가
			lower_cnt++;
		else if(temp>='0'&&temp<='9')
			//숫자 개수 증가
			numeric_cnt++;
		
			
			
		else if(temp>=32&temp<=47||temp>=':'&&temp<=64||temp>=91&&temp<=96||temp>=123&&temp<=126) {
			//기호 개수증가
			
			if(temp =='>'||temp=='<'||temp=='('||temp==')'||temp=='%'||temp =='\\'||temp==';'||temp==' ') 
				isUseless=true;
			else
				symbol_cnt++;
		}}
	System.out.println("대문자 개수:"+upper_cnt);
	System.out.println("소문자 개수:"+lower_cnt);
	System.out.println("숫자 개수:"+numeric_cnt);
	System.out.println("기호 개수:"+symbol_cnt);
	
	if(upper_cnt<1) 
		msg+="\n2) 영문대문자 1개 이상 포함해야합니다.";
	 if(lower_cnt<1)
		msg+="\n3) 영문소문자 1개 이상 포함해야합니다.";
	if(numeric_cnt<1)
		msg+="\n3) 숫자 1개 이상 포함해야합니다.";
	if(symbol_cnt<1)
		msg+="\n4) 기호 1개 이상 포함해야합니다.";
	if(isUseless)
		msg+="\n 사용할수 없는기호>,<,(,),;,%,\\ 공백이 있습니다";
	if(tempword.length()>=8&&upper_cnt>=1&&lower_cnt>=1&&numeric_cnt>=1&&symbol_cnt>=1&&!isUseless)
				isOk=true;
	
	System.out.print("결과:"+(isOk?"사용할수 있는 패스워드 입니다":"패스워드 작성규칙에 맞지 않습니다"));
	System.out.println(msg);		//isok참일때				//isok거짓일때
	sc.close();
}
}
