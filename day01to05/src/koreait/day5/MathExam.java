package koreait.day5;

import java.util.Scanner;

public class MathExam {

	// 작성자 :정다산(2022/01/04)
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean check=true;
		System.out.println("1.덧셈\t2.뺄셈\t3.곱셈\t4.종료");
		while(check) {
	System.out.println("연산을 선택하세요");
	int input=sc.nextInt();
		if(input==4) {
			System.out.println(" 프로그램을 종료 합니다.Bye,,👍👍");
			check=false;
			continue;
		}else if(!(0<input&&input<5)) {
			System.out.println("다시 입력해주세요");
			continue;//반복문 처음으로 돌아가기 아랫문장 실행안함
		}
	System.out.println("✏️값1을 입력하세요.");
	int value1=sc.nextInt();
	System.out.println("✏️값2을 입력하세요.");
	int value2=sc.nextInt();
	if(input==1) {
		System.out.printf("정답:%d + %d = %d\n\n",value1,value2,value1+value2);
	}else if(input==2) {
		System.out.printf("정답:%d - %d = %d\n\n",value1,value2,value1-value2);
	}else if(input==3) {
		System.out.printf("정답:%d * %d = %d\n\n",value1,value2,value1*value2);
	}else {System.out.println("다시 입력해주세요");
		}
	
		}
	sc.close();	
	}
	
}
