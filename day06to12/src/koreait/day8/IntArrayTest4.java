package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
	//IntArrayTest 첫번째 예제는 day7프로젝트에 있습니다
	//int값 저장하느 배열을 활요하는 연습입니다(3)
public static void main(String[] args) {
	//배열의 크기는 20->메모리 할당
	int []scores=new int[20];
	//배열의 값은 난수 1~100 범위값저장
	Random r1 =new Random(System.currentTimeMillis()); //난수 발생에 필요한 seed값 설정
	for (int i = 0; i < scores.length; i++) {
		scores[i]=r1.nextInt(100)+1;
	}
	System.out.println(Arrays.toString(scores));//배열값을 출력합니다
	//값의 분포 개수를 90~100,80~89.70~79,60~69,50~59,40~49,40미만 범위로 출력하빈다
	//카운트 변수 4개 초기화->ㅂ누포가 더 다양하다면? 변수가 더많이 필요합니다->cnt변수값도 배열 사용
	int[]cnts =new int[7];
	//위 분포 순서대로 인덱스를 사용합시다
	//저장된 20개 벼열의 값중에서 70이상 값을검색 -출력:인덱스와 값
	for (int i = 0; i < scores.length; i++) {
		if(scores[i]>=90) {
			cnts[0]++;
		}else if(scores[i]>=80) {
			cnts[1]++;
		}else if(scores[i]>=70) {
			cnts[2]++;
		}else if(scores[i]>=60) {
			cnts[3]++;
		}else if(scores[i]>=50) {
			cnts[4]++;
		}else if(scores[i]>=40) {
			cnts[5]++;
		}else {cnts[6]++;}
	}//결과 출력: 연습문제 -출력을 반복문으로 수정하기(90 100 80 89 출력되는 숫자를 수식으로 가능?)
	System.out.println("점수분포 요약------");
	System.out.println("90~100 :"+cnts[0]);
	System.out.println("80~89:"+cnts[1]);
	System.out.println("70~79:"+cnts[2]);
	System.out.println("60~69:"+cnts[3]);
	System.out.println("50~59:"+cnts[4]);
	System.out.println("40~49:"+cnts[5]);
	System.out.println("40미만:"+cnts[6]);
	
	
}
}
