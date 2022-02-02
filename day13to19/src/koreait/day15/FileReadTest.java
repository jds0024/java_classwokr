package KoreIt.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
//System.in:표준 입력(콘솔/키보드 입력)지금까지 입력은 표준 입력.이제는 파일 입력을 연습합니다.
public static void main(String[] args) {
	//파일 입력:데이터를 파일에서 읽어옵니다.
	String filename="C:\\dev\\test\\자바테스트.txt";
	//파일객체를 생성
	File file = new File(filename);
	//file변수가 참조하는 파일 클래스 객체를 데이터 입력에 사용하기위한 클래스는 Scanner 입니다
	
	try {
		Scanner fsc =new Scanner(file);
		
		//String temp=fsc.nextLine();				//행(line) 단위로 읽어 옵니다.
		//System.out.println("읽어온 문자열:"+temp);
		System.out.println("----------------------");
		
		//hasXXX()메소드:다음 토큰(구분기호로 분리)이 있는지 체크
		while(fsc.hasNext()) {//hashNext():다음줄에 읽을게 있으면true 없으면 fasle
			System.out.println(fsc.nextLine());
		}
		fsc.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
