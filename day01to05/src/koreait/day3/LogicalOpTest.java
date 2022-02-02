package koreait.day3;

import java.util.Scanner;

public class LogicalOpTest {//논리연산을 연습합니다
	//논리 연산 : and(&&),or(||),not(!)->연산결과는 boolean 타입
	//   ->관계연산을 복합적으로 검사할 때 사용합니다.
	
	
	public static void main(String[] args) {
		//응용 :국어점수 90이상이고 총점이 250이상이면 우수 학생
		int korean, sum;
		 korean=92;
		 sum=260;
		
		 if(korean>=90&&sum>=250) {
			 System.out.println("국어 특기 우수 학생");
		 }
		 //국어 점수가 80점 이상이거나 총점이 200점 이상이면 pass
		 if(korean>=80||sum>=200) {
			 System.out.println("pass");
			 System.out.println("END");
		 }
		System.out.println("논리연산 결과 확인하기: and");	 
		System.out.println("true and true =" +(true&&true));	 
		System.out.println("true and false =" +(true&&false));	 
		System.out.println("false and true =" +(false&&true));	 
		System.out.println("flase and flase =" +(false&&false));
		
		System.out.println("논리연산 결과 확인하기 :or");
		System.out.println("true or true =" +(true||true));	 
		System.out.println("true or false =" +(true||false));	 
		System.out.println("false or true =" +(false||true));	 
		System.out.println("flase or flase =" +(false||false));	 
		
		System.out.println("논리연산 결과 확인하기:not");
		System.out.println("not true ="+!true);
		System.out.println("not false="+!false);
		 
		 //Quiz:Korean이 40~69인 학생들은 "선생님 면담"
		korean =105;
		if(korean>=40&&korean<=69) {
			System.out.println("선생님 면담!!!");
		}
			//    korean 국어 점수가 0~100이 아닌값은"잘못된 값"출력하빈다
		if(!(korean>=0&&korean<=100)) {
			System.out.println("잘못된값");
		}
		
		 
	}

}
