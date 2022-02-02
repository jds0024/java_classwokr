package koreaIt.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {
public static void main(String[] args) {
	TreeMap<String, String>dic = new TreeMap<>();
	Scanner sc= new Scanner(System.in);
	boolean check=true;
	while(check) {//while 안에 switch로 종료조건을 동작시킬때 break로 못합니다->boolean사용했음
		System.out.println("선택기능 1.단어저장 2.단어검색 3.단어장보기 4.프로그램 끝내기");
		int select =sc.nextInt();
		sc.nextLine();
		String Korean="";
		String English="";
		switch (select) {
		case 1://단어저장(스위치문에 정수 이외에 것으로도 할수있음 문자열일때 equal 필요 없음)
			System.out.println("English-->");
			English=sc.nextLine();
			
			System.out.println("Korean-->");
			Korean=sc.nextLine();
			if(dic.containsKey(English)) {
				String temp=dic.get(English);
				temp+=" ,"+Korean;
				
				dic.put(English, temp);
			}else
			dic.put(English, Korean);
			
			break;
		case 2://단어 검색
			System.out.println("English-->");
			
			
			English=dic.get(sc.nextLine());
			System.out.println("Korean-->"+English);
			break;
		case 3:
			System.out.println(dic);
			
			break;
		case 4: 
			System.out.println("::::프로그램을 종료합니다::::");
			check=false;
			continue;
			
	
		default:
			System.out.println("다시입력해주세요,입력가능한 숫자는 1~4입니다.");
			break;
	}// switch end
	}// while end
	
	
}

}
