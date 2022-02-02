package koreaIt.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
								//ctrl누르고 마우스로 클릭하면 원래 위치로 갈수있음
public class MyDictionaryApp {//애플리 케이션 클래스 (main메소드를 응용프로그램 실행을 시작합니다.)
	//전역변수 선언
	static Scanner sc=new Scanner(System.in);
	static List<Word> myword =new ArrayList<>();		//단어들의 목록(단어장)
	public static void main(String[] args) {
		String filename="C:\\dev\\test\\mydict.txt";
		boolean run =true;
		while(run) {
			System.out.println("선택기능 1.단어추가 2.단어 보기 3.파일에 저장 4.파일에서 불러오기5.프로그램 끝내기");
			System.out.print("선택->");
			String sel =sc.nextLine();
			
			switch (sel) {
			case "1":
				wordAdd();
				break;
			case "2":
				wordList();
				break;
			case "3":
				wordSave(filename);
				break;
			case "4":
				wordRead(filename);
				break;
			case "5":
				run=false;
				break;

			default:
				System.out.println("::::잘못된 선택입니다.::::");
				break;
			}
			
			
			
			
		}//whileEnd
		System.out.println("::::프로그램 종료합니다,::::");
	}//mainEnd
	
	
	


	private static void wordAdd(){//단어추가
		System.out.println("[새로운 단어추가]입니다.");
		do{
			System.out.print("English ->");String eng =sc.nextLine() ;
			System.out.print("우리말 뜻 ->");String kor =sc.nextLine() ;
//입력받은 eng가 mywords 리스트에 있느냐  있다면 -	몇번째 인덱스에있는지알아내서 그위치에 kor담기,
								//없다면- kor추가할 리스트 생성해서 담기
			List<String> koreans;
			int index=-1;
			for (int i = 0; i < myword.size(); i++) {
				Word w =myword.get(i);
				if(w.getEnglish().equals(eng)) {
					index=i;
					koreans=w.getKoreans();//이미 존재하는 리스트 객체를 가져와서 koreans 변수가 참조합니다
					koreans.add(kor);
					break;
				}
			} 
			if(index== -1) {
				koreans=new ArrayList<>();	//우리말 뜻 리스트 생성
				koreans.add(kor);
				myword.add(new Word(eng,koreans));
			}
			
			
			
			
			
			
			System.out.println("단어 추가 계속 하시겠습니까?(y or n) - >");
		}while(sc.nextLine().equals("y"));
	}

	private static void wordList(){//단어 목록
		for(Word w :myword)
			System.out.println(w);
	}
	
	private static void wordSave(String filename){	//파일에 단어들을 저장
		File file = new File(filename);
		
		try {
			PrintWriter pw =new PrintWriter(file);
			for(Word w :myword)
				pw.println(w);
			System.out.println("저장이 완료되었습니다");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다");
		}
	}
	private static void wordRead(String filename) {//파일에서 저장된 단어들 읽어옵니다.
		File file =new File(filename);
		
		try {
			Scanner fsc=new Scanner(file);
			while(fsc.hasNext()) {	//파일 읽기 ->myword리스트에 저장할 객체로 생성합니다
				//System.out.println(fsc.nextLine());
				StringTokenizer stk=new StringTokenizer(fsc.nextLine(),":[]");
				while(stk.hasMoreTokens()) {//파일에서 1라인씩 읽어오고그것을 토큰화 하기.->Word객체 생성할 필드값
					//System.out.println(stk.nextToken(":["));
					Word w =new Word(stk.nextToken());
					List<String> kor =Arrays.asList(stk.nextToken().split(", "));
					//split결과 타입은 배열을 리스트로 변환
					w.setKoreans(kor); //두번째 토큰을 리스트로 변환해서 koreans 필드 값으로 참조.
					myword.add(w);		//word객체를 myword리스트에 추가하기
					//substring 메소드로"]"제외:String temp =stk.nextToken; temp.substring(0,temp-1).split(", ")
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다.");
		}
		
		
		
		
		
		
		
		
	}
}
