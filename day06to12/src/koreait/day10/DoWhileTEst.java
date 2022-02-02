package koreait.day10;

public class DoWhileTEst {
//반복문:do~while(조건식);   형식 연습
	public static void main(String[] args) {
		int i=0;
		while(i>5) {                          //1)i<5은 5번 2)i>5는 0번 *while은 조건식을 먼저 검사->참일때{}실행
			System.out.println("i="+i);
			i++;
		}
		
		int k=0;
		do {
			System.out.println("k="+k);
			k++;
		}while(k>5);                //1)k<5는 5번 2)k>5
									//*do~while은 조건식을 마지막에 검사.->최소 1번은{}실행
		System.out.println("The End!");
		
		
		
		
	}
	
	
}
