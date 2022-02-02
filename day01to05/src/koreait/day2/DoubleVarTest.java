package koreait.day2;

public class DoubleVarTest {

	public static void main(String[] args) {
		// 실수 타입 변수를 연습합시다
		//1. 선언
			float p1;
			double p2; 
		//2.데이터저장
			p1 =3.1415f;	//float 형식으로 데이터를 표시할 때에 f를 표기
			p2 =3.1415;
		//3.변수 사용:연산
			p2 =p2 * 1.1;
			//p1=p1*1.1;  //사칙연산결과는 double 입니다
			
			System.out.println("변수 p2="+ p2);
			System.out.println(p1);
			//실제 기계어로 실수를 표현하는 방식은 복잡한 형식이 있다. 실제 결과와 다를 수도 있다
			System.out.println(0.1+1.6);
			System.out.printf("%5.2f\n",(0.1+1.6));//%f는 실수형식,전체 5자리 ,소수점 2자리까지
			
			//실수의 특별한 연산결과
			System.out.println("Infinity :0.0으로 나눌때 입니다");
			System.out.println(3.0/0.0);
			System.out.println("NaN(Not a nember : 제수,피젯수 모두0.0일때 입니다)");
			System.out.println(0.0/0.0);
			System.out.println("0.0:0.0울 다른수로 나눌 때 입니다");
			System.out.println(0.0/3.0);
			
			//그렇다면 정수는?>>0으로 나눌때 오류가 발생.
			//System.out.println(3/0);
			//System.out.println(0/0);
			System.out.println(0/3);
			
			//정수와 비교할 내용
			short s1=11;
			//s1=s1+s1;   //오류
			
			float f1 =1.2f;
			p1 =p1+p1; //정상
			
			//데이터형식의 변환:캐스팅이라고 함 >내일 진도에서 설명
			
			
			
			
			
			
			
			
			
	
	}

}
