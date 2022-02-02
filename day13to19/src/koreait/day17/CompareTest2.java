package koreIt.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {
	//User객체를 5개 생성하고 list에 담아서 sort(null) 해보세요
	//User 타입은 비교 가능한 객체
	public static void main(String[] args) {
		
	
	List<User> users =new ArrayList<>();
	users.add(new User("tom",23));
	users.add(new User("jamie",18));
	users.add(new User("ann",32));
	users.add(new User("nana",27));
	users.add(new User("momo",29));
	
	System.out.println("sort 이전:"+users);
	users.sort(null);  //User타입은 비교가능한 객체입니다
	System.out.println("sort 이후:"+users);
	
	}
}
