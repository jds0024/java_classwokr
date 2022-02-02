package koreait.day4;

import java.util.Scanner;

public class MinValueEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("값을 비교할 정수 세개를 입력하세요");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int max=0;
		int min=0;
		if(n1>n2) {
			 max =n1;
			 min =n2;
		}if(n1<n2)
			max=n2;
			min=n1;
		if(max<n3)
			max=n3;
		if(min>n3)
			min=n3;
		
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
		//조건연산자 (삼항연산자)
		max=(n1>n2)? n1:n2;
		min =(n1<n2)? n1:n2;
		max=(max<n3)? n3:max;
		min=(min>n3)? n3:min;
		sc.close();
		
	}

}
