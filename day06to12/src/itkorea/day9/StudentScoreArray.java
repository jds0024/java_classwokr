package itkorea.day9;

import java.text.DecimalFormat;

public class StudentScoreArray {
	//studentScore 클래스이 배열을 연습합니다
public static void main(String[] args) {
	
	StudentScore[] iclass =new StudentScore[5];
	//iclass 배열이 저장하는 값은 무엇일까요??

		for (int i = 0; i < iclass.length; i++) {
			System.out.println(iclass[i]);
			//참조하는 객체가 없습니다 ->null
			}
		iclass[0]=new StudentScore();		//객체를 생성해서 배열요소가 참조
		iclass[0].inputData();			//객체를 먼저 생성하지않으면 null pointer오류 발생 
		
		//반복문으로 객체를 3개 만들어서 인덱스1~3요소가 참조하도록합니다
		for (int i = 1; i <=3; i++) {
			iclass[i]=new StudentScore();
			iclass[i].inputData();
		} 
		iclass[4] = new StudentScore();
		System.out.println("객체 생성하고 필드값은 없는 경우;");
		iclass[4].printScore();
		
		System.out.println("<학생명단>");
		for (int i = 0; i <iclass.length; i++) {
			System.out.print("\t "+iclass[i].name);
		}
		System.out.println();
		//학생이름-총점,평균(소수점 2자리) 형식으로 출력
		for (int i = 0; i < iclass.length; i++) {
			DecimalFormat df = new DecimalFormat("###.##");//출력형식을 지정합니다 #하나가 1자리수
			String avg =df.format(iclass[i].avg());//출력형식을 적용하여 문자열로 변환합니다
			System.out.println(iclass[i].name+"-총점:"+iclass[i].sum()+",평균:"+avg);
			
			
			
		}
		
		
		
		//printscore()메소드 출력
		for (int i = 0; i < iclass.length; i++) {
			iclass[i].printScore();
		}
		
	
		
		
}
//지역변수는 초기값이 자동으로 설정되지 않습니다
//전역변수(클래스 필드)는 초기값이 참조타입은null,기본형타입은 0or 0.0
}
