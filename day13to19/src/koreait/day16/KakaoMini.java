package koreaIt.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {
	 public static final int Max_LIMIT=100000;
	
public KakaoMini(String owner) {
	super(owner);

}
@Override
	public int upLimit(int plus) {
		if(limit+plus>Max_LIMIT)
			return 0;
		else {
			limit+=plus;
			return plus;
		}
			
	}	
@Override
	public int pay(int money) {
		if(money+payTotal>limit)
			return 0;
		else{
			payTotal+=money;
			return money;
		}
	}
DecimalFormat df =new DecimalFormat("###,###,###,### ");
@Override
public String toString() {
	
	return owner+"님. 이번달 결제예정금액 "+df.format(payTotal)+" 원 입니다.\n" + 
	"[이용한도 "+df.format(limit)+"원]";
}
}
