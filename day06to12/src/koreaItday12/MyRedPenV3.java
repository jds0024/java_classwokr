package koreaItday12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyRedPenV3 {
public static void main(String[] args) {
	ArrayList<MathPloblem> addList = new ArrayList<MathPloblem>();
		
	Scanner sc =new Scanner(System.in);
	Random r =new Random();
	int ans;
	int cnt=0; //맞은 갯수 카운트
	System.out.println("------------");
	System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
	System.out.println("------------");
	System.out.println("시작합니다");
	for (int i = 0; i <5; i++) {
		
	
		MathPloblem p1 =new MathPloblem('+');
		addList.add(p1);//p1은 주소값이라  미리 저장한후에 값을줘도 된다
		p1.makeProb(); //문제 만드는 메소드 :연산종류에 따라 숫자가 다른범위 난수로 만들어집니다
		System.out.println("문제"+(i+1)+". "+p1+" 답입력 ->");
		ans=sc.nextInt();
		
		if(ans ==p1.showAnswer()) {
			cnt++; p1.setCorrect(true);
		}
	}//forend
	System.out.println("--------------------------------");
	System.out.println("채점합니다. 맞은 갯수 "+cnt+"("+(cnt*20)+" 점");
	System.out.println("::::틀린문제 다시보기::::");
	for(MathPloblem prob :addList) {//인덱스를 쓰지 않는 for 문
		if(!prob.isCorrect()) {
			System.out.println(prob +"정답: "+prob.showAnswer()); 
		}
			
		}
	System.out.println(addList);
	sc.close();

	

	
	
}}
