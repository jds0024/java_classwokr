package itkorea.day9;

import java.util.Random;
import java.util.Scanner;

public class NumberGame2 {

	public static void main(String[] args) {
		System.out.println("숫자 맞추기 게임 시작합니다.");
		Random rn= new Random();
		int constant =rn.nextInt(200)+100;
		System.out.println(constant);
		
		boolean check =true;
		int count=0;
		int[] answer=new int[100];
		System.out.println("숫자가 결정됬습니다.\n결정한 숫자를 맞쳐보세요.");
		System.out.println("결정된 숫자는 101~299사이에 숫자이고 입력범위도"
				+ "같습니다\n 입력범위를 벗어날시 미입력으로 처리 됩니다");
		Scanner sc =new Scanner(System.in);
		while(check) {
			System.out.print("생각한 숫자 입력 ->");
			answer[count]=sc.nextInt();
			if (answer[count]==constant) {
				System.out.println("딩동댕 맞추혔습니다.\n"+(count+1)+"번만에 맞추셨습니다\n"+"지금까지 시도한 값\n");
			for (int i = 0; i <=count; i++) {
				System.out.print(answer[i]+"\t");
			}check=false;
			}else if(answer[count]>constant&&answer[count]<300) {
				System.out.println("아닙니다 더 작은값입니다");
			}else if(answer[count]<constant&&answer[count]>100){
				System.out.println("아닙니다 더 큰 값입니다");
			}else {
				System.out.println("결정된 숫자의 범위는 101~299사이의 숫자입니다(미입력 처리)");
				continue;
			}
			
			count++;
			
			
			}//while
			
			
			
			}
			
			
			
		}
		
				
	
		
	


