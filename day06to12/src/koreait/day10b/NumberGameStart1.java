package koreait.day10b;

import java.util.Scanner;

public class NumberGameStart1 {
//NumberGame 실행-게임 기록 저장
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberGame[] result=new NumberGame[5]; //게임기록 저장 최대5번
		int k=0;
		
		System.out.println("숫자 맞추기 게임입니다");
		System.out.println("게임을 시작하려면 이름을 쓰세요");
		String gamer=sc.nextLine();
		
		do {
			NumberGame ng =new NumberGame(gamer);
			int[] numbers =new int[10];
			
			if(k==5) break;
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
			int random=ng.makeNumber(101, 200);
			System.out.println(random);
			System.out.println("맞춰보세요");
			
			int i = 0;

			do {
				System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
				numbers[i] = sc.nextInt();
				if (random > numbers[i]) {
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random <numbers[i]) {
					System.out.println("아닙니다. 더 작은 값입니다.");
				}    
					
				
						if (i >= 9) {
							ng.setCount(i+1);
							break;}
						i++;
				
				
						if(random==numbers[i]) {
							ng.setSuccess(true);}
			} while (random != numbers[i-1]); 
			
			if(ng.isSuccess()) {
				System.out.println("정답입니다. 지금까지 시도한 숫자");
				System.out.println(".."+ng.getCount()+"만에 정답입니다");
				result[k]=ng;
			}else {
				System.out.println("실패 모든기회를 다 사용했습니다");
				System.out.println("정답은"+random+"입니다");
			}
			ng.print();
			if(k==4)
				System.out.println("이번이 마지막 게임입니다");
			if(k<4)
			System.out.println("게임을 계속 하시겠습니까? 계속하려면 0입력하세요.->");
			k++;
		}while(sc.nextInt()==0);
		
		System.out.println("::::Game End::::");
		 
		 
	
		
		
		
		
	}

}
