package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
	//int값 저장하느 배열을 활요하는 연습입니다(1)
public static void main(String[] args) {
	//배열의 크기는 20->메모리 할당
	int []scores=new int[20];
	//배열의 값은 난수 1~100 범위값저장
	Random r1 =new Random();
	for (int i = 0; i < scores.length; i++) {
		scores[i]=r1.nextInt(100)+1;
	}
	System.out.println(Arrays.toString(scores));//배열값을 출력합니다
	int cnt=0;//카운트 변수:조건에 맍는경우 +1증가합니다
	//저장된 20개 배열의 값중에서 70이상 값을검색 -출력:인덱스와 값
	for (int i = 0; i < scores.length; i++) {
		if(scores[i]>=70) {
			System.out.println("i="+i+"\t점수="+scores[i]);
			cnt++;
		}
	}
	System.out.println("70 이상 값의 갯수:"+cnt);
	
	
}
}
