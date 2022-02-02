package koreait.day4;

public class ForTest1 {
	public static void main(String[] args) {
	for (int i = 0; i <0; i++) {//반복횟수 제어를 위한 변수 i :i=0시작값,조건 i<5,증감i=i+1
		System.out.println("hello!!!!!"+i);
	}
	for (int i = 1; i < 0; i++) {
		System.out.println("Hello!("+i+")");
	}
	//조건식에 변수를 활용
	int end =100;
	for (int i = 0; i < end; i+=2) {
		System.out.printf("%d+%d=%d\n",i,i+1,i+(i+1));
	}
	
		
	}
	
	}
	
	
	
	

