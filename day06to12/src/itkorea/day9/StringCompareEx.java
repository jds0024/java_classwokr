package itkorea.day9;

import java.util.Scanner;

public class StringCompareEx {
	//문자열 찾기 기능을 연습해 봅니다 :한글 단어 ->영문단어 출력
	public static void main(String[] args) {
		String[] engArray 
		= {"continue","exit","switch","constant","identifier","array","break","print"};
		String[] korArray
		= {"계속","종료","선택","상수","식별자","배열","탈출","출력"};
		Scanner sc = new Scanner(System.in);
		
		while(true){//String 클래스의 메소드 :equals(문자열 전체비교),contains(문자열 부분적인 포함 )
			String find;     //사용자 입력한 문자열 참조할 변수
			System.out.println("찾을 문자열 입력하세요.(한글) ->");
			find =sc.nextLine();
			
			int i=0;
			
			boolean check=false;
			for (; i < korArray.length; i++) {
				//배열 인덱스 0~마지막 까지 각각 참조 문자열과 find 문자열 동일한지 비교.
			System.out.println("i="+i+",비교결과="+korArray[i].equals(find));
			if(korArray[i].equals(find)) {
				check=true;
			break;
			}
			//사용자 입력한 문자열이 배열 인덱스 몇번 문자열과 같은지 찾기 입니다.
			}
			if(check) {
			System.out.println("find 입력 문자열은 "+i+"번 인덱스에 있는'"+korArray[i]+"'입니다");
			System.out.println("'"+korArray[i]+"'는(은) 영문키워드는'"+engArray[i]+"'입니다");
			break;
			}else 
			System.out.println("find 입력 문자열은 존재하지 않습니다");
			
		}//while
	 }
	
}
