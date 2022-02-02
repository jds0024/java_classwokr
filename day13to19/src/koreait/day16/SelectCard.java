package koreaIt.day16;

import java.util.Scanner;

public class SelectCard {
public static void main(String[] args) {
	//카드 개겣 생성해서 이용한도, 카드사용일 메소드로 테스트해보세요
	Scanner sc =new Scanner(System.in);
	System.out.println("카드를 발급 받으려면 이름을 입력해주세요");
	String name=sc.next();
	System.out.println("발급받으실 카드를 선택해주세요\n1.카카오미니카드 2.카카오vip카드");
	int temp=sc.nextInt();
	if(temp==1) {
		KakaoMini km=new KakaoMini(name);
		int[] arr=new int[4];
		System.out.println("선택하신 카드의 기본한도는 10000원입니다\n최대 100000원까지 한도 증가 가능입니다");
		km.upLimit(10000);
		System.out.println("카드발급이 완료 되었습니다.");
		System.out.println("목록을 선택해주세요");
		boolean check=true;
		while(check) {
			System.out.println("1.닭가슴살(4000원) 2.프로틴쉐이크(3000원)\n3.프로틴바(2000원) 4.샐러드(3500원)");
			System.out.println("5.한도 증가 6. 종료 및 이번달 결제예정금액 확인");
			int choice=sc.nextInt();
			switch (choice) {
				case 1:
					if(km.pay(4000)==0) System.out.println("한도가 초과되었습니다");
					else {System.out.println("4000원이 결제 되었습니다");
					arr[0]++;
					}break;
					
				case 2:
					if(km.pay(3000)==0) System.out.println("한도가 초과되었습니다");
					else {System.out.println("3000원이 결제 되었습니다");
					arr[1]++;
					}break;
				
				case 3:
					if(km.pay(2000)==0) System.out.println("한도가 초과되었습니다");
					else {System.out.println("2000원이 결제 되었습니다");
					arr[2]++;
					}break;
				
				case 4:
					if(km.pay(3500)==0) System.out.println("한도가 초과되었습니다");
					else {System.out.println("3500원이 결제 되었습니다");
					arr[3]++;
					}break;
					
				case 5:
					System.out.println("증가시킬 한도를 입력해주세요");
					int plus=sc.nextInt();
					if(km.upLimit(plus)==0) System.out.println("증가할 수 있는 한도를 초과했습니다");
					else System.out.println(" 한도가 증가하였습니다");
					break;
					
				case 6:System.out.println("종료 후 결제 예정금액 확인하실 수 있습니다");
						System.out.println("::종료합니다::");
						check=false;
						continue;
				
				default:
					System.out.println("지정된 숫자를 입력해주세요");
					break;
			}
		}//while
			
		
		
	}else if(temp==2) {
		System.out.println("선택하신 카드의 한도를 입력해주세요 최대 20,000,000까지 가능합니다");
		int limit=sc.nextInt();
		KakaoVIP kv=new KakaoVIP(name, limit);
		System.out.println("카드발급이 완료 되었습니다.");
		}
	
	
	
	
	
}
}
