package koreaItday12;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> lotto = new ArrayList<>();//선택된 숫자 저장
	ArrayList<Integer> balls = new ArrayList<>();//공45개 저장하는 리스트 ->44개->43개
	Random r= new Random();
	//1. balls 리스트에 1~45숫자를 추가한다ㅣ.
	for (int i = 1; i<=45; i++) {
		balls.add(i);
	}
	//확인: 출려해보기
	//System.out.println(balls);
	//2. balls 리스트에서 뽑을 인덱스를 난수 0~44->0~43->0~42.....->0~39
	//2-1.난수 인덱스에 해당하는 요소를 lotto리스트에 추가합니다
	//2-2.뽑힌 난수 인덱스의 요소는 삭제 (제거)합니다.
	for (int i = 0; i <6; i++) {
		int temp=r.nextInt(45-i);
		lotto.add(balls.get(temp));
		balls.remove(temp);
		//System.out.println(balls);
		
	}
	
	
	//3.최종 lotto 변수가 참조 하는  값을 출력합니다 
	lotto.sort(null);
	System.out.println(lotto);
	
	}//ArrayList의 중요 메소드 :size(),add(),get(),remove()

}
