package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class RealLotto {
	//확률을 반영해서
public static void main(String[] args) {
	
	int [] num=new int[45];
	Random r =new Random();
		
	for (int i = 0; i < 45; i++) {//인덱스 범위 0~44
		num[i]=i+1;				//값 범위 1~45
	}
	System.out.println(Arrays.toString(num));
	
	
	//1.배열에서 데이터 삭제
	
	int[] lotto= new int[6];
	int k; //삭제할 위치의 인덱스->랜덤한값으로 합니다
	for (int cnt = 0; cnt <6; cnt++) {
		//인덱스 범위를 -1씩 줄이면서 난수 발생시킵니다
	k=r.nextInt(45-cnt);//경계값을 45(0~44),44(0~43) 43(0~42) 42(0~41) 41(0~40) 40(0~39))
	System.out.println("k="+k+"\t"+num[k]);
	lotto[cnt]=num[k];
	for(int i=k;i<num.length-1;i++) {
		num[i]=num[i+1];			//인덱스 i+1의 배열값은
	}
	System.out.println(Arrays.toString(num));
	}
	//k번째 위치의 데이터를 lotto[]에 저장
	Arrays.sort(lotto); //lotto 배열값 순서대로 위치 변경
	System.out.println(Arrays.toString(lotto));
	
	
//	k=23; //삭제할 위치의 인덱스
//	for(int i=k;i<num.length-1;i++) {
//		num[i]=num[i+1];			//인덱스 i+1의 배열값은
//	}
//	System.out.println(Arrays.toString(num));
//	k=7; //삭제할 위치의 인덱스
//	for(int i=k;i<num.length-1;i++) {
//		num[i]=num[i+1];			//인덱스 i+1의 배열값은
//	}
//	System.out.println(Arrays.toString(num));
}
}
