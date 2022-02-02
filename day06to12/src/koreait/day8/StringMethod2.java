package koreait.day8;

public class StringMethod2 {
	//문자열 메소드 연습2
public static void main(String[] args) {
	//1. indexOf:contains처럼 특정 문자열을 찾아서 시작 위치값을 반환
	
	String msg = "koreait.2021@gmail.com";
	System.out.println("gamil의 시작 위치"+msg.indexOf("gmail"));
	System.out.println("gamil의 시작 위치"+msg.indexOf("naver"));//해당 문자열이 없을때 반환값은 -1
	
	msg="it gmail it gmail";
	System.out.println("마지막gamil의 시작 위치"+msg.lastIndexOf("gmail"));
	System.out.println("gamil의 시작 위치"+msg.indexOf("gmail"));
	//2.문자열의 첫부분 또는 마지막 부분을 검사하는 메소드
	System.out.println("korea로 시작하는가?"+msg.startsWith("korea"));
	System.out.println("it로 시작하는가?"+msg.startsWith("it"));
	
	System.out.println("com으로 끝는가?"+msg.endsWith("mail"));
	System.out.println("@로 끝는가?"+msg.endsWith("@"));
	
	//3. 문자열 부분적인 추출하기
	String temp;
	msg="i like java";
	temp=msg.substring(4);
	System.out.println("substring(4):"+msg.substring(4));
	temp=msg.substring(4,8);
	System.out.println("substring(4,8):"+msg.substring(4,8));
	//문제 :java를 추출하려면?
	System.out.println(msg.substring(7));
	//문제 like추출하기
	System.out.println(msg.substring(2,6));
	int start= msg.indexOf("like");
	int len ="like".length();
	temp = msg.substring(start,start+len);
	System.out.println("start:"+start+",len:"+len+",추출결과:"+temp);
	//4.문자열 치환하기
	msg="kreait.2021@gmail.com- 2021";
	temp=msg.replace("2021", "1999"); //인자가 2개 -첫번째가 찾는 문자열,두번째가 변경할 문자열
	System.out.println("replace 결과:"+temp);
	temp= msg.replace("gmail", "daum");
	System.out.println("replace 결과:"+temp);
	
	msg="그는 오늘 치킨을 그녀와 먹는다. 치킨 브랜드는 ...치킨의 재료 우너산지는 브라질산이다.";
	//msg 문자열에서 "치킨이 " 몇번나오는지
	int idx;			//치킨의 위치 저장
	int cnt =0;
	temp=msg;
	String find="그녀";
	while(true) {
		idx=temp.indexOf(find);
		if(idx==-1) break;
		cnt++;
		temp=temp.substring(idx+find.length()); //"치킨"은 길이가 2
	}System.out.println(find+"을(를) 찾은 횟수:"+cnt);
}
}
