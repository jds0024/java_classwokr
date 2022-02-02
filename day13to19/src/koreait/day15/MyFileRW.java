package KoreIt.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileRW {

	static void fileWrite(String filename,Object[] data) {
		File file = new File(filename);
		
		try {//파일 입력또는 파일출력할때 자바는 꼭 try catch로 처리하도록 합니다
			PrintWriter pw =new PrintWriter(file);
			//파일에 쓰기
			for (int i = 0; i < data.length; i++) {
				pw.println(data[i]);
			}
			
			pw.close(); //파일작업 종료:출력 버퍼에서 파일로 전송됩니다
			System.out.println("파일출력이 완료되었습니다");
		
		} catch (FileNotFoundException e) {//파일출력은 파일없으면 자동생성합니다 :.Exception안생깁니다.
			//그러나 ....없는 경로 지어하면 Exception 생깁니다
			System.out.println("없는 파일을 선택했습니다("+e.getMessage()+")");
		}
	}


static void fileRead(String filename) {
	File file=new File(filename);
	try {
		Scanner fsc=new Scanner(file);
		while(fsc.hasNext()) {
			System.out.println(fsc.nextLine());
		}fsc.close();
	} catch (FileNotFoundException e) {
		System.out.println("경로/파일명 오류:"+e.getMessage());
		
	}
}
}
