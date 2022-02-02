package koreait.day7;

public class CharArrayTest {
	//char타입의 배열을 연습합시다.
	public static void main(String[] args) {
		//배열의 선언
		char[] carr1= {'i','a','m','j','a','v','a'};
		char[] carr2= new char[20];
		System.out.println("carr1배열길이 (크기):"+carr1.length);
		System.out.println("carr2배열길이 (크기):"+carr2.length);
		
		System.out.println("carr1 배열 3번째 데이터의 값:"+carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값:"+carr2[2]);
		
		for (int i = 0;i<carr1.length; i++) {
			System.out.println("carr1["+i+"] 의 데이터 값:" +carr1[i]);
		}
		//**
		for (int i = 0;i<carr1.length; i++) {
			System.out.print(carr1[i]);
		}
		
		//문자타입 char의 배열은 문자열과 유사
		System.out.println(carr1);  //위의 **for문과 동일한 출력.
		
		String name="java";
		//carr2="hellow hi goodbye"; char배열에 바로 문자열 대입은 오류
		carr2 ="hellow hi goodbye".toCharArray(); //String문자열 객체를 char배열로 변환
		System.out.println(carr2);
		
		carr2 ="hellow hi goodbye hellow hi goodbye".toCharArray();//선언된 배열이 크기보다 클때
		System.out.println("carr2.length:"+carr2.length);//->배열의 크기가 커집니다
		
	}

}
