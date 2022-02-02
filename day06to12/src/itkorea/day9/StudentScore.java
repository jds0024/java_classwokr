package itkorea.day9;

import java.util.Scanner;

public class StudentScore {
int num;
String name;
int korean;
int english;
int science;

Scanner sc = new Scanner(System.in);
//추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
void inputData() {
	//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
	//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
	System.out.print("이름 ->  " );  		this.name = sc.next();
	System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
	System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
	System.out.print("영어 ->  " );		this.english = sc.nextInt();
	System.out.print("과학 ->  " );		this.science = sc.nextInt();
	
}


 void printScore() {  //default접근 권한
	System.out.print("번호:"+num+"\t");
	System.out.print("이름:"+name+"\t");
	System.out.print("국어:"+korean+"\t");
	System.out.print("영어:"+english+"\t");
	System.out.print("과학:"+science+"\t\n");
}int sum(){
	return (korean+english+science);
}double avg(){
	return (double)(sum()/3);
}
	
	@Override
		protected void finalize() throws Throwable {//마지막에 한번 실행되는
			// TODO Auto-generated method stub
			super.finalize();
			sc.close();
		} 
 }

