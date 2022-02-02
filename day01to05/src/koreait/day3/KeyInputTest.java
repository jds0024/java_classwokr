package koreait.day3;

import java.util.Scanner; //java.util 패키지의 Scanner 클래스를 메모리에 로드합니다
						//java.lang 패키지의 클래스들은 기본클래스 - import필요 없음

public class KeyInputTest {//키보드로 입력으로 변수에 값을 저장하는 연습
	public static void main(String[] args) {
		//키보드 입력은 표준 입력이라 부름:System 클래스에 in 이라는 필드 사용
		//>편하게 입력을 처리하기 위해 Scanner 클래스를 사용
		//화면출력은 표준 출력이라하고:System 클래스 out필드를 사용
		
		//import를 필요로 합니다
		Scanner sc = new Scanner(System.in);//sc는 변수. 기본형 변수가 아니고 창조형(클래스타입)변수
//		int data =sc.nextInt();
//		
//		
//		System.out.println("지금 입력하신 값은"+data +"입니다");
		
//		double ddata =sc.nextDouble();
//		System.out.printf("%.3f",ddata);
		int korean =0;
		int english =0;
		int science =0;
		System.out.println("성적을 입력하세요");
		System.out.print("국어->");
		korean =sc.nextInt();
		System.out.println("영어->");
		english=sc.nextInt();
		System.out.println("과학->");
		science=sc.nextInt();
		System.out.println(">>처리되었습니다.");
		int sum =korean+english+science;
		System.out.println("총점:"+sum);
		System.out.print("평균:"+sum/3+"\t");
		System.out.printf("%.2f",sum/3.0);
		
	}
}
