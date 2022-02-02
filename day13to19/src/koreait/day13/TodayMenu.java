package koreaIt.day13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		 System.out.println("저녁메뉴 투표");
		 String foods ="오늘의 저녁메뉴 :치킨 ,떡볶이, 곱창전골, 오징어 물회 ,불고기";
		;
		
		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어 물회", 0);
		map.put("불고기", 0);
		
		while(true) {
			int temp;
			System.out.println(foods);
			System.out.print("선택메뉴 음식이름을 입력하세요.(종료:end)->");
			String menu=sc.nextLine();
			if(menu.equals("end")) 
				break;
			if(map.containsKey(menu)==false) {//키값으로 없는 문자열이 입력된 경우==!map.containsKey(menu)
				System.out.println("없는 메뉴를 선택했습니다.");
				//continue;;
				map.put(menu,1);
				foods+=", "+menu;
			}else {
		//입력한 메뉴가 key 값입니ㄷ. 해당 key의 value값을+1증가 시키고 그값을 map에 변경합니다	
			temp=map.get(menu);		//temp++;
			map.put(menu,++temp);	//이미 있는 key의 value 값을 변경
			//map.put(menu,temp++); temp값을 먼저 put메소드로 저장 -> temp+1증가
			//  ->map.put(,enu.temp); temp++;
			//map.put(menu,++temp); temp+1증가->temp값을  put메소드로 저장 
			//  ->temp++; map.put(menu,temp)
			//결론 :++또는 -- 연산은 다른 메소드 또는 연산자 또는 출력문...과 같이 쓰일때 위치에 따라 먼저 
			//		또는 나중에 실행 
			}
			
			System.out.println("현재 투표상황:"+map);
		}
		System.out.println("투표종료");
		System.out.println("최대 득표수:"+Collections.max(map.values()));//value중에 가장 큰값(최대값)
		System.out.println("테스트:"+Collections.max(map.keySet()));  //키값 정렬시 최대값
		
		//Collections의 종류:List(ArrayList),Map(HashMap,TreeMap),Set(HashSet):집합,이터레이터
	}

}
