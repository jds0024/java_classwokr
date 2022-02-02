package koreaIt.day18;


public class StringSplit {
	//String 클래스의 split 메소드를 이용하여 StringTokenizer 동작을 연습한다.
	//split이 일반적으로 더 많이 쓰임(다른언에에서도 비슷하게 많이 사용)
public static void main(String[] args) {
	String temp="모모 90 88 79";
	
	String[] result = temp.split(" "); 	//메소드의 리턴타입은? String[]
						//split:구분기호를 기준으로 문자열을 쪼개어(나누다 ,분리하다)배열로 참조시키도록 합니다
	System.out.println(result[0]);
	System.out.println(result[1]);
	System.out.println(result[2]);
	System.out.println(result[3]);
	
	for (String data:result) 
		System.out.println(data);
		
		temp="모모,90,88,79";
		result=temp.split(",");
		System.out.println("----구분기호: , ----");
		for(String data:result)
			System.out.println(data);
		
		
		temp="모모--90--88--79";
		result=temp.split("--");			//인자가 문자열이므로 문자열 형태로 해봅니다
		System.out.println("----구분문자열:정규식 표현(나중에 할 예정)으로 합니다.----");
		System.out.println(result.length);
		for(String data:result)
			System.out.println(data);
	
}
}
