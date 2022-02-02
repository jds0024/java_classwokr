package koreaIt.day18;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class STringTokenTest {

	public static void main(String[] args) {
		//예시 StudentScore 객체가 파일에 저장되어있습니다 .하나의 문자열 "모모90 88 79"과 같은 형태입니다.
		//	->저장되어있는 문자열을 파일에서 읽기 하여 다시 StudentScore객체로 생성한다면
		//  ->구분기호 공백을 기준으로 데이터를 분리(토큰화)합니다 -> STringTokenizer클래스 메소드를 사용합니다
		
		String temp="모모 90 88 79";
		StringTokenizer stk =new StringTokenizer(temp);
		
		System.out.println("::nextToken메소드 결과 확인::");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		//stk 객체는 hasMoreTokens()로 모든 토큰을 다읽으면 더이상 읽을 토큰이 없을때 거짓이 되어서 반복종료
		//↓아래 이 코딩이을 토크나이저를 초기화 하는 것이 필요합니다
		stk=new StringTokenizer(temp);
		System.out.println("::객체로 만들어 봅니다.:::");
		while(stk.hasMoreTokens()) {
			StudentScore stu =new StudentScore(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			System.out.println(stu);
		} 
		// \t\n\r\f :공백,탭,줄바꿈,->잘안쓰는 기호:carriage return(커서를 맨앞으로) ,form feed
		//공백,탭,줄바꿈은 기본적인 구분기호입니다
		System.out.println("::::객체를 여러개 만드는 예시::::");
		temp="모모 90 88 79\n 나나 92 83 91\n다현 80 87 84";
		stk=new StringTokenizer(temp);
		//ArrayList에 여러 객체를 참조
		List<StudentScore> ss=new ArrayList<>();
		while(stk.hasMoreTokens()) {
			StudentScore stu =new StudentScore(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			ss.add(stu);
			System.out.println();
		}
		System.out.println("List :" +ss);
		
		
		
		
		
		
		
		
		
		
	}

}
