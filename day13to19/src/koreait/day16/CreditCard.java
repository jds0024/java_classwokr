package koreaIt.day16;

public abstract class CreditCard {
	//부모 클래스는 자식크래스가 사용하도록 protected로 합니다
	protected String owner;
	protected int limit;
	protected int payTotal;
	//protected(자식클래스에선 그냥 쓸수있음)
	public CreditCard(String owner) {
		this.owner = owner;
	}
	//추상메소드 선언
	public abstract int upLimit(int plus);	//이용한도 증가
	public abstract int pay(int money);	//카드사용 money에서 차감
	
	
	
	
	
	
	
	
	//getter
	public String getOwner() {
		return owner;
	}

	public int getLimit() {
		return limit;
	}

	public int getPayTotal() {
		return payTotal;
	}
	
	
	
	

}
