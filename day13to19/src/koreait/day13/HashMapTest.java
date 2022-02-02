package koreaIt.day13;

import java.util.HashMap;
import java.util.TreeMap;

//ArrayList:순차적(index로 접근)으로 데이터를 관리하는 자료구조안입니다.배열과 유사
//HashMap:순차적인 구조가 아님. 인덱스가 없고 대신 key값을 이용하여 데이터를 접근하여 저장/읽기 
		//검색이 많은 알고리즘에 유호한다
//위의 2개 클래스는 제너릭 타입을<> 기호안에 표시합니다.HashMap 은 K:Key, V:value 한쌍
// 제너릭타입은 int,long,double기본형 타입대신에 래퍼(wrapper) 클래스 사용
public class HashMapTest {
public static void main(String[] args) {

		 //HashMap<String, Integer>map =new HashMap<>();
		 //key:String  타입 ,Value:int 데이터
		 
		TreeMap<String, Integer>map = new TreeMap<>(); //key값으로 오름차순 정렬이 가능한 Map
	
		 //1.데이터 저장
		 map.put("돼지국밥",9000);
		 map.put("스파게티",13000);
		 map.put("불고기",15000);
		 map.put("곱창전골",20000);
		 map.put("백반",7000);
		 
			 System.out.println(map);	//toString 재정의 되어있습니다
			 
		//2.데이터 읽어오기
		System.out.println("key:곱창전골의 가격="+map.get("곱창전골")+" 원");
		System.out.println("key:삼겹살의 가격="+map.get("삼겹살")+" 원");
		
		//key값으로 가져올 값이 없으면 결과= null
		String key="백반";
		System.out.println("key: "+key+"의 가격="+map.get(key)+" 원");
		
		map.put("돼지국밥",8000);		//실행결과:세로운 데이터추가?xx value 변경
		System.out.println(map);	//			ㄴMap은 key(모든타입)가 index(정수) 역활을 한다
									//			ㄴkey값은 유일하다
		map.remove("불고기",10000);					//인자 ,리턴형식:objext->모든타입;
		//key하고value  모두 일치할때만 제거됩니다.
		System.out.println("삭제결과"+map);
		map.remove("불고기",15000);
		System.out.println("삭제결과"+map);
		
		int temp=map.remove("백반");
		System.out.println("remove int 리턴값"+temp);//삭제된 항목의 value값이 변환
		System.out.println("삭제결과"+map);
}

}