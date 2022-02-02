package koreait.day7;

import java.util.Scanner;

public class DeCypherTest {
public static void main(String[] args) {
	String msg;
	char[] temp;
	String deCypherMsg;
	System.out.println("해독할 암호화된 문자를 입력하세요");
	Scanner sc =new Scanner(System.in);
	 msg=sc.nextLine();
	temp=msg.toCharArray();
	
	for (int i = 0; i < temp.length; i++) {//
		temp[i]-=7;
		
}
	System.out.println(temp);
	deCypherMsg=String.valueOf(temp);
	System.out.println(deCypherMsg);
}
}//이 예제의 결론:String을 char[] 배열로 변환 할수있다 	-	문자열.toCharArray()
//			char[]배열을  String으로 변환 할수있다 		-	String.ValueOf(문자배열)