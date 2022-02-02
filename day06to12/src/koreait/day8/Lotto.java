package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
public static void main(String[] args) {
	//난수 1~45범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장
	int[] lotto=new int[6];
	Random r1=new Random();
	boolean isOk=true;
	for (int l= 0; l < 5; l++) {
		
	
	for(int i=0;i<6;i++) {
		int temp =0;
		isOk=true; 
		while(isOk) {
			temp=r1.nextInt(45)+1;
			int j;
			for (j = 0; j < i; j++) {//j==i이면 for종료
				//현재 배열 인덱스 i의 앞에 있는 배열들과 temp값 비교
				if(temp==lotto[j]) break;//for j 에서 탈출
				                         //i는 4로 예를 들면,1)j가 2의 배열값ㄷ이 temp와 같다면
											//for-j탈출했을때 아래 **부분의 조건은 거짓\
											//2)j=0~3까지 배열값 비교했을때 모두  temp 와 다른 값이라면
			}//for j end						//그때 그아래 **부분의 조건은 참
			if (j==i)isOk= false;//**//isOk변수 쓰지않고 while(true)로 한뒤 break 로 해도됨
			//j<i 조건으로 for를 반복할때 , j가 i값이 되면 거짓이라 for가 종료되죠.
			//결국 for가 끝나면 그래서 i== j 인것이고요.

			
			}//while end
			lotto [i]=temp;
	}
	
 System.out.println(Arrays.toString(lotto));}
 
}}
