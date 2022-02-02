package koreaItday12;

import java.util.ArrayList;

public class MemberArrayList {
public static void main(String[] args) {
	Member[]members= new Member[10]; //배열 10개 요소에 Member 객체르 ㄹ참조시키도록 합니다

	
	//ArrayList에 클래스 타입객체 추가하기
	ArrayList<Member> mlist=new ArrayList<>();//뒤에서는 타입 생략가능
	
	Member momo = new Member(); //momo변수는 객체의 주소를 저장
	mlist.add(momo);			//그 주소를 mlist에 추가합니다.
	momo.id=20221234; momo.name="이모모";
	System.out.println("momo="+momo);			  //momo변수와
	System.out.println("mlist(0) ="+mlist.get(0));//mlist,get(0)요소에 저장된 주소값은 같다 
	mlist.add(new Member(20221111,"사나"));
	mlist.add(new Member(20220111,"미나"));
	mlist.add(new Member(20227854,"쯔위"));
	System.out.println(mlist);
	System.out.println("-------------------------------");
	for (int i = 0; i < mlist.size(); i++) {
		Member temp =mlist.get(i);
		System.out.println("index:"+i+" element:"+temp);	//.toStrin이 생략된건 프린트 문에서
		}
	mlist.add(1, new Member(19990111,"나연"));
	mlist.remove(3);
	System.out.println("-------------------------------");
	for (int i = 0; i < mlist.size(); i++) {
		System.out.println("index:"+i+" element:"+mlist.get(i));	
		}
	mlist.remove(momo);//객체의 참조값을 전달하여 삭제합니다..인자의 타입이 object일때입니다
	System.out.println("-------------------------------");
	for (Member temp:mlist) {//변수 i를 사용안할때 ,빠른(향상된)for문 -for(요소타입서언 변수명:리스트 또는 배열변수명) 반복횟수도 자동으로 설정해줌
		System.out.println("element:"+temp);	
	}//ArrayList는 요소의 추가/삭제가 쉽습니다.
}
}