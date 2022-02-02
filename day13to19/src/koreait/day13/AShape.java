package koreaIt.day13;
//추상클래스:객체를 직접생성하지 않는 형태의 클래스 입니다.
//			추상메소드를 갖고 있습니다.   추상(abstract):구체화되지 않은 상태.
//부모클래스에 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드) 하도록 하는것입니다
public abstract class AShape {//추상 클래스
	
	private String shapeName;
	
	//추상메소드 선언->자식메소드가 구체화 합니다.
	public abstract double getArea();//메소드 몸체{실행내용..}없고 ;으로 선언만 합니다
	
	
	//getter,setter-자식클래스가 상속받아 사용할 수 있다.
	public String getShapeName() {
		return shapeName;
	}public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
