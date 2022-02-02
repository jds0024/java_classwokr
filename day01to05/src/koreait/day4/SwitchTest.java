package koreait.day4;

import java.util.Scanner;

public class SwitchTest {//if문을 switch문으로 바꾸는 연습
public static void main(String[] args) {
	
	System.out.println("[[사용자 메뉴]]");
	System.out.println("1:장바구니  2:상품목록  3:결제  4:배송조회   5:종료");
	System.out.println("선택하세요. ->");
	
	//import 한번에 하는 단축키 :Ctrl Shift O
	Scanner sc =new Scanner(System.in);
	int menu= sc.nextInt();
	
	
	if(menu==1) {
		System.out.println("장바구니로 이동합니다");
	}else if(menu==2) {
		System.out.println("상품목록으로 이동합니다");
	}else if(menu==3) {
		System.out.println("결제화면으로 이동합니다");
	}else if(menu==4) {
		System.out.println("배송조회로 이동합니다");
	}else if(menu==5) {
		System.out.println("프로그램을 종료합니다");
	}else {
		System.out.println("잘못된 선택입니다");
	}
	System.out.println("[[프로그램 종료]]");
	
	
	//위의 조건은 ==(같다) 비교로  여러개의 else if를 사용
	//이런경우 switch 문을 사용할수 있음
	System.out.println("\n\nswitch로 동일한 테스트");
	switch (menu) {
	case 1: // 비교값으로 사용할 수 있는 데이터형식 : 정수형식 ,char, String
		System.out.println("장바구니로 이동합니다");
		break;// break를 만나면 스위치 종료 (빠져나감)
	case 2:
		System.out.println("상품목록으로 이동합니다");
		break;
	case 3:
		System.out.println("결제화면으로 이동합니다");
		break;
	case 4:
		System.out.println("배송조회로 이동합니다");
		break;
	case 5:
		System.out.println("프로그램을 종료합니다");
		break;
	default: // menu가 1,2,3,4,5 중 해당되는 값이 아닐때 실행 (if문에서 else에 해당)
		System.out.println("잘못된 선택입니다");
			break;
	}
	System.out.println("switch문 프로그램 종료");
	sc.close();
	
	
	
}
}









