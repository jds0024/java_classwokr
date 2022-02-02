package koreait.day6;

public class MethodTEst {
	//클래스(또는 객체)의 구성:필드, 메소드
	// 메소드를 이해하는 연습입니다,단 같은 클래스에서  사용되는 경우 입니다
	//static:정적인(고정된), static성질끼리 서로 사용가능.
public static void main(String[] args) {
	System.out.println(); //system은 클래스,out은 (객체형)필드,println은 out의 메소드
	//메소드 실행- 메소드 이름 호출합니다
	testMethod1();  //메인 메소드 특징:static,실행할수있는 메소드는 static만 가능
	testMethod1(); //->static은 static 성질을 갖는 요소들만 사용합니다
	//testMethod2(123, 123);오류->두번째 인자의 형식이 틀림
	testMethod2(123, "momo");
	testMethod2(9876, "쯔위");
	testMethod22(1.34,23,4.56);
	testMethod22(23,45,1.8987);//인자값 전달할때 자동변환(casting)됩니다
	int result =testMethod3();			   //반환값(리턴값)이 있는 메소드는 변수를 사용하여 저장 또는 출력을 합니다
	System.out.println(result);
	System.out.println("testMethod3 retrun="+testMethod3());
	System.out.println("testMethod3 retrun 더하기="+(testMethod3()+11));
	System.out.println(testMethod33());
	
	System.out.println("testMethod retorn="+testMethod4(34,67));
	double d_result=testMethod44(5.9, 9);
	System.out.println(d_result);
	System.out.println(dayOfWeek(2)); //반환받은 문자열의 참조값으로 해당 내용을 출력
	
	}//main end

//1.인자(args),반환값이 없는(void) 메소드
static void testMethod1() {       //메소드 정의 연습 1
	System.out.println("첫번째 메소드 정의 연습입니다");
}
//2.인자 있고 반환값 없는 메소드
//인자개수는 제한이 없다. 변수 선언과 같은 방식으로 ,로 구분한다. 인자는 메소드 실행에 필요한 데이터
static void testMethod2(int a, String name) {//인자 2개
	//메소드를 실행할 때는 정수 , 문자열 순서에 맞게 값을 지정하고
	//그 값을  a는 정수값,name은 문자열 참조값에 저장합니다
	System.out.println("정수값="+a);
	System.out.println("name="+ name);
}
static void testMethod22(double a,int b,double c) {
	System.out.println("인자값 합계="+(a+b+c)); //실수값+정수값=실수값
}
//3.인자 없고, 반환값이 있는(반환되는 데이터의 형식) 메소드 
static int testMethod3() {
	return 145;		//반환값이 있는 형식에서는 꼭 있어야하나는 명령문->return
}
static String testMethod33() {
	return "수요일";
}
//4.인자 있고 , 반환값이 있는 메소드
static int testMethod4(int a,int b) {
	return(a+b);
}
static double testMethod44(double a,int b) {
	double result=a+b;
	return result;
}
//정수값을 전달 받습니다. 1이면 월요일 2이면 화요일,3이면 수요일.....,7이면 일요일을 리턴
//리턴하는 메소드 ->1~7이외의 값은 unknown
static String dayOfWeek(int a) {//String 이면 return도 참조값
//	if(a==1)
//		return "월요일";
//	else if(a==2)
//		return "화요일";
//	else if(a==3)
//		return "수요일";
//	else if(a==4)
//		return "목요일";
//	else if(a==5)
//		return "금요일";
//	else if(a==6)
//		return "토요일";
//	else if(a==7)
//		return "일요일";
//	else
//		return "unknown";
	String result="unknown";
	switch (a) {
	case 1:
		result ="월요일";
		break;
	case 2:
		result ="화요일";
		break;
	case 3:
		result ="수요일";
		break;
	case 4:
		result ="목요일";
		break;
	case 5:
		result ="금요일";
		break;
	case 6:
		result ="토요일";
		break;
	case 7:
		result ="일요일";
		break;
	

	//default:result="unknown"
		//break;
	}
	return result;		//result문자열의 참조값(메모리의 주소)를 반환합니다
}


}
