package koreaItday12;

public class ToStringTest {
public static void main(String[] args) {
	Member member =new Member();
	member.id=20220100;
	member.name="이모모";
	member.print();//지금까지 만들었덛 메소드:필드 추력용도입니다
	
	System.out.println("toString결과:"+member.toString());
	//toString 재정의 하기전
	//toString결과:koreaItday12.Member@15db9742(패키지명,클래스명@객체 구별값 16진수)
	//tosTring 재정의 한 결과:toString결과:koreaItday12.Member@15db9742
	System.out.println("toString 생략:"+member);//객체 이름만 써도 됨
}
}
