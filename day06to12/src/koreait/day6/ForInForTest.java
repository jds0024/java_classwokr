package koreait.day6;

public class ForInForTest {

	public static void main(String[] args) {
		
		for(int k=1;k<6; k++) {
			for (int i = 0; i < k; i++) 
				    System.out.print(i);
				System.out.println("\t\t\t-"+k);
				//System.out.println("\t\t\t-"+i);//변수 i는 안쪽 for문에서 선언된변수
		}										//안쪽 for문이 종료되면 사용못함 -오류	
		
		
		}
	}


