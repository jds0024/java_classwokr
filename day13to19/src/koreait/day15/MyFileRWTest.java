package KoreIt.day15;

public class MyFileRWTest {
public static void main(String[] args) {
	 MyFileRW.fileRead("C:\\dev\\test\\자바테스트.txt");
	 MyFileRW.fileRead("C:\\dev\\test\\DirectX.log");
	 
	 String[]menu = {"삼겹살","스파게트","곱창전골","불고기","탕수육"};
	 Member[] members= {new Member("모모",17),new Member("사나",21),null,null,null};
	// System.out.println(member.length);
	 members[2]=new Member("쯔위",22);
	 members[3]=new Member("나연",19);
	 members[4]=new Member("다현",18);
	 
	 String filename ="C:\\dev\\test\\자바테스트.txt";
	 MyFileRW.fileWrite(filename, menu);
	 MyFileRW.fileWrite(filename, members);//같은 파일일때는 덮어 쓰기
}
}
