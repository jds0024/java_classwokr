package koreait.day7;

import java.util.Scanner;

public class CyperTest {
	//연습예제		
	//내용 :모모가 쯔위에게 메세지를 전달하는 비밀메시지로 암호화를 합니다
	//	     모모와 쯔위는 암호를 푸는(해독,복호화) key값으로 7이라는 숫자를 정했습니다
	//고대암호: 문자하나 +key=?새로운 문자->이방법으로 메시지를 암호화
	public static void main(String[] args) {
		//원본메시지:키보드 입력
		//암호 메시지:cyperString 를 출력합니다
		Scanner sc= new Scanner(System.in);
		int key=7;
		String msg;
		String cypherString;  //암호메시지
		char[] temp;	//초기값선언과 배열크기선언도 없이 할 수 있다.
		
		System.out.println("보내고 싶은 원본 메시지 입력하세요. ->");
		msg =sc.nextLine();
		
		//msg를 temp로 변환하여 참조 합니다
		temp=msg.toCharArray();
		//문자하나 +key 결과값은 temp배열로 저장
		for (int i = 0; i < temp.length; i++) {
		//temp[i]=temp[i]+key;\
			temp[i]+=key;//축약 연산자는 강제 캐스팅 안하고 연산.
		}
		
		
	
		
		//추가기능:temp는 문자배열을 문자열로 변환 참조
		cypherString=String.valueOf(temp);//String.valueof메소드는 여러 타입 데이터를 문자열로 변환
		System.out.println("암호 메시지:"+cypherString);//p'sprl'qh}h
		
	}
	
	
}
