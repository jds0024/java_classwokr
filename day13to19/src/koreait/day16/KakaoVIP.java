package koreaIt.day16;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{
	
	public static final int MAX_LIMIT = 20000000;   
	
	private int point;
	
	public KakaoVIP(String owner,int limit) {
		super(owner);
		this.limit=limit;
		System.out.println(owner+"님이 원하시는 한도 " + limit +"원으로 설정되었습니다.");
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public int pay(int money) {
		if(payTotal+money>limit) {			//추가  현재 이용급액+money가 limit보다 크다면
		limit+=5000000;
		System.out.println("한도가 자동으로 증가 하였습니다");
		payTotal+=money;
		}else
			payTotal+=money;								//자동으로 한도를 500만원 올려줌
			
		this.point+=money*0.01;		//vip카드는 포인트가 있고 포인트 사용금액 0.1%
		return money;
	}
	
	@Override
	public int upLimit(int plus) {
		limit +=plus;
		System.out.println("고객님은 제한없이 한도 조정 가능합니다.[" + limit + " 입니다.");
		return plus;
	}		
	DecimalFormat df =new DecimalFormat("###,###,###,### ");
	@Override
	public String toString() {
		
		return owner+"님. 이번달 결제예정금액 "+df.format(payTotal)+" 원 입니다.\n" + 
		"[이용한도 "+df.format(limit)+"원   포인트"+df.format(getPoint())+"]";
	}
}
