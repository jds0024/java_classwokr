package itkorea.day9;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayTest {
	//문자열 (클래스)배열을 연습합니다
	public static void main(String[] args) {
		 
		String[] strArray = {"continue","break","switch","array","print"}; //초기값 지정하면서 배열 선언,
		
		for (int i = 0; i < strArray.length; i++) 
			System.out.println("i="+i+",문자열:"+strArray[i]);
			
// 	String 클래스 메소드 실행:charAt(0),subString(2,5)를 각 배열요소 문자열로 실행합니다.			
			for (int i = 0; i < strArray.length; i++) {
				System.out.println("charAt(0):"+strArray[i].charAt(0)+
						",subString(2,5):"+strArray[i].substring(2, 5));
			}
			
		String[] names =new String[5];	//지정된 문자열이 없으므로 값은 null(없다.)상태
		for (int i = 0; i < names.length; i++) {
			System.out.println("i="+i+",문자열="+names[i]);
			//String은 클래스,문자열은 객체->names배열,names[1] 둘다 참조(주소)값을 저장합니다.
			
		}//		System.out.println("charAt(0):"+names[0].charAt(0)+
//				",subString(2,5):"+names[0].substring(2, 5));
//			//문자열이 null일때 charAt등 메소드 실행은 오류 발생.
			//->오류의 명칭(원인)은 NullPointerExeption
		
		
		Scanner sc= new Scanner(System.in);	//키보드 입력 준비
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름 입력하세요 -> ");
			names[i]=sc.nextLine();
		} 
			//네임즈 배열값 출력
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		} 
		
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("charAt(0):"+names[i].charAt(0)+
//					",subString(2,5):"+names[i].substring(2, 5));
//		}

		//names 배열의 영문자를 모두 대문자로 변환하여 names 배열 요소로 참조(지정)하도록 합니다
		for (int i = 0; i < names.length; i++) {
			names[i]=names[i].toUpperCase();
		}
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
		
		
	}
}
