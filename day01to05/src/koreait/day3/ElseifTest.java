package koreait.day3;

import java.util.Scanner;

public class ElseifTest {
public static void main(String[] args) {
	//if 문의 형식2 : if(조건관계식1){     A    } A는 관계식1이 참 일때 실행
		//else if(조건관계식2){       B        } B는 관계식 1이 거짓,관계식2는 참 일때 실행
		//else{     C   }//관계식1,2거짓 일때 c실행
		
		
		//응용 :point가 150이상면 사과세트를 ,100~149이면 귤세트
		//			50~99이면 과자세트,0~49이면 5000원 상품권
	
	
	
		Scanner sc =new Scanner(System.in);
		int point;
	
		System.out.println("포인트를 입력하세요. ->");
		point =sc.nextInt();
		
		if(point>=150) {
			System.out.println("사과세트");
		}else if(point>=100) {//else 덕분에 point<=149 안 써줘도 됨
			System.out.println("귤세트");
		}else if(point>=50) {
			System.out.println("과자세트");
		}else if(point>=0) { 
			System.out.println("5000원 상품권");
		}else {
			System.out.println("포인트를 다시 입력해주세요");
			
		}
		sc.close(); //Scanner 타입 변수 사용종료
		
		//리소스 (자원): 입출력 클래스는 메모리등 추가적인 자원을 사용하므로 해제도 필요로 합니다
}
}
