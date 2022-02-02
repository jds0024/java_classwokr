package koreaItday12;

import java.util.Scanner;

public class MyRedPenV2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	char op;
	System.out.println("연산입력->");
	do{op=sc.nextLine().charAt(0); 
	if(op=='0') {//종료 조건을 먼저 검사합니다
		System.out.println("프로그램을 종료합니다.!!!");
	}else if(!(op=='+'||op=='-'||op=='/'||op=='*')) {
		System.out.println("잘못된 선택입니다");
		continue;
	}else {//op는 + - * / 중하나 일때만 해당됩니다
	
		MathPloblem p1 =new MathPloblem(op);
		p1.makeProb();
		//p1.print();
		System.out.println(p1); //tostring 재정의 적용한 예(객체 이름으로만 사용가능)
		System.out.println("정답:"+p1.showAnswer());
	}
	}while(op!='0');
	System.out.println("::::The End:::");
}
}
