package koreait.day4;

import java.util.Scanner;

public class StrarPrint {
public static void main(String[] args) {
	//예제: 영화감상 후기1~5 평점 입력,3★
	Scanner sc =new Scanner(System.in);
	System.out.println("[[영화감상 후기]]");
	System.out.println("평점을 몇 점 주시겠습니까?(1~5) ->");
	int point =sc.nextInt();
	System.out.println("방법1)");
	for (int i = 0; i <point; i++) {
		System.out.print("★");
	}
	
	
	System.out.println("\n방법2-1)");
	
	for (int i = 0; i < point; i++) {
		System.out.print("★");
	}for (int j = 0; j < 5-point; j++) {
		System.out.print("☆");
	}
	
	System.out.println("\n방법2-2)");
		
	for (int i = 0; i < 5; i++) {
		if(i<point)System.out.print("★");
		else System.out.print("☆");
	}
	System.out.println("\n방법2-3)");
	int k;
	
	for (k=0;k<point;k++) 
		System.out.print("★");
	//위에 for 를 종료하면 k는 point값과 같다
	for(;k<5;k++)	{//초기값을 생략 k=point
		System.out.print("☆");
	//k를 밖에서 선언했기때문에 for문이 끝나도 k값이 유지
	}
//	for(int i=0;;i++) {//조건식이 없음->무한루프(무한반복)
//		System.out.println("test");
	sc.close();
	}
	}


