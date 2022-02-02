package KoreIt.day15;

import java.util.Random;

public class RandomPrimeNum {
	//주어진 난수범위에서 소수가  7개 만듭니다.소수 7개는 배열 저장하여 출력합니다
	//->주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다 (메소드 이름 isPrime,리턴형식 boolean,인자 1개)
public static void main(String[] args) {
	Random r=new Random();
	int[] arr=new int[7];
	int cnt=0;
	while(cnt!=7) {
		int temp=r.nextInt(900)+100;
		if(isPrime(temp)) {
			arr[cnt]=temp;
			cnt++;
		}
		}
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
	}
		
	}
	
	



	
	
	






static boolean isPrime(int num) {
	boolean isPrime2 =true;
	
	for (int i = 2; i <num; i++) {		//조건은 *i<num, **i<num/2,***Math.sqrt(num)
		if(num% i==0)	isPrime2=false;
		
		
		
		
	}
	return isPrime2;
	
}


}
