package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class MyRendPen {
//배열
	public static void main(String[] args) {
		Random r =new Random();
		Scanner sc= new Scanner(System.in);
		System.out.println("두자리 덧셈 시작합니다\n문제를 몇번 풀건지 입력해주세요.");
		int cycle=sc.nextInt();
		String arr[]=new String[cycle];
		int cnt=0;
		String correct="";
		String incorrect="";
		boolean isOk=true;
		
		for (int i = 0; i < cycle; i++) {
			int rA=r.nextInt(100);
			int rB=r.nextInt(100);
			System.out.print("문제"+(i+1)+".  "+rA+" + "+rB+" = 답 입력-->");
			if(sc.nextInt()==(rA+rB)) {
				arr[i]="맞은문제     문제"+(i+1)+".("+rA+"+"+rB+")";
			}else {
				arr[i]="틀린문제     문제"+(i+1)+".("+rA+"+"+rB+")";
			}
		}for (int i = 0; i < arr.length; i++) {
			if(arr[i].contains("맞은문제")) {
				cnt++;
				correct+=arr[i]+"\n";
			}else {
				incorrect+=arr[i]+"\n";
			}
		}
		System.out.println("채점 합니다. 맞은 갯수는'"+cnt+"'개 입니다. 틀린문자의 갯수는'"+(cycle-cnt)+"'개 "
				+ "입니다.");
		
			while(true) {
				System.out.println("맞은문제를 보려면 '1번'\n틀린 문제를 보려면'2번'\n"
						            +"\n종료하려면 '3번'을 눌러주세요 ");
				int check=sc.nextInt();
		if(check==1) {
			System.out.print("<맞은문제>\n"+correct+"\n");
		}else if(check==2) {
			System.out.println("<틀린문제>\n"+incorrect);
		}
		else if(check==3) {
			System.out.println(":::시스템종료:::");
			break;
			
			
		}
		}
			
	}
}
