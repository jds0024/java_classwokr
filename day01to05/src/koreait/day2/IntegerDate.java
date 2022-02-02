package koreait.day2;

public class IntegerDate {

	public static void main(String[] args) {
		//정수 데이터 형식 연습합니다(byte 1바이트에 저장하는정수)
		//Byte ,short, Integer, Long클래스는 정수 데이터 형식을 다룹니다(Wrapper 클래스 종류)
		System.out.println(":::1바이트에 저장하는 Byte 정수 확인:::");
		System.out.println("Byte 정수의 크기 :" + Byte.BYTES);//메모리의 할당 크기
		System.out.println("Byte 정수의 최솟값 :" + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최댓값 :" + Byte.MAX_VALUE);
		//Byte 클래스의 필드(특정 값을 저장) :BYTES,MIN_VALUE,MAX_VALUE(메서드 아님 괄호 없음)
		//	필드는 클래스에 속하며
		//  필드 중에서 변하지 않는값(상수)은 일반적으로 모두 대문자로 표기
		
		
		System.out.println(":::short에 저장하는 Byte 정수 확인:::");
		System.out.println("short 정수의 크기 :" + Short.BYTES);
		System.out.println("short 정수의 최솟값 :" + Short.MIN_VALUE);
		System.out.println("short 정수의 최댓값 :" + Short.MAX_VALUE);
		
		System.out.println(":::int에 저장하는 Byte 정수 확인:::");
		System.out.println("int 정수의 크기 :" + Integer.BYTES);
		System.out.println("int 정수의 최솟값 :" + Integer.MIN_VALUE);
		System.out.println("int 정수의 최댓값 :" + Integer.MAX_VALUE);
		
		System.out.println(":::long에 저장하는 Byte 정수 확인:::");
		System.out.println("long 정수의 크기 :" + Long.BYTES);
		System.out.println("long 정수의 최솟값 :" + Long.MIN_VALUE);
		System.out.println("long 정수의 최댓값 :" + Long.MAX_VALUE);
	}

}
