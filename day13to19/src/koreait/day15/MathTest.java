package KoreIt.day15;

public class MathTest {
	public static void main(String[] args) {
	//2부터 num-1까지 나누어서 나머지가 0인값이 있으면 소수아님
		//***2~루트(제곱근)값까지 나누기 하면됩니다
		//**제곱근 대신에 2부터 num/2(몫)까지 나누어서 할 수도 있습니다
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(22));
		
		System.out.println("어떤 정수가 소수인지 확인합니다 . 어떤 정수 입력->");
		int num=935;
		
		boolean isPrime =true;
		
		for (int i = 2; i <num; i++) {		//조건은 *i<num, **i<num/2,***Math.sqrt(num)
			if(num% i==0)	isPrime=false;
			
			
			
			break;
		}
		if(isPrime) 
			
			System.out.println(num+"은 소수 입니다");
		
		else
			System.out.println(num+"은 소수가 아닙니다");
			
		
		}
		
	}

