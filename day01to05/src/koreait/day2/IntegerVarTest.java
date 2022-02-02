package koreait.day2;

public class IntegerVarTest {
	//이 자리에서 선언된 변수는 클래스의 필드가 됩니다
	//변수: 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
	// 		변수는 프로그램이 실행되는동안에 임시로 사용하는 메모리 공간입니다.
	// 		데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여합니다.
	// 		변수 선언한다>>변수명과 데이터 형식을 지정하는 것.>>메모리에 공간 할당 된다
	
	public static void main(String[] args) {
		// 지역 변수 선언
		byte n1;	//데이터 형식은 byte,변수명은 n1
		short n2;
		int n3;
		long n4;
		// 변수 선언 할 때에는 기본형(primitive)타입 사용합니다.
		//선언된 변수에 데이터 저장:대입문(=기호사용)
		 //n1=1997;   //오류 :overflow	
		 n1=100;
		 n2=30000;
		 //n2=400000; 	//오류 :overflow
		 n3=40000;
		 n4=40000000000L;
		//변수의 사용 : 출력/입력 ,연산 등  
		 n3=n3+100;
		 System.out.println(n1);				 
		 System.out.println(n2);				 
		 System.out.println(n3);				 
		 System.out.println(n4);				 
		 
		 //short 연산시 주의
		// short result;
		 //result = n2+ 100; //오류:100 은 기본적으로 int형식(4바이트)
		 					
		 int result2;	//	n2는 short인데  정수의 사칙연산 결과는 4바이트임
		 result2 = n2 +n2;
		 
		 //
	}

}
