package review;

public class Triangle extends Shape {
 public Triangle(String shapeName, int width, int height) {
	super(shapeName,width,height);
	//Shape 클래스에는 기본생성자 없고 커스텀 생성자만있음 case:B
}
  public void print() {//getShapeName()이렇게 써야하는이유:Shape클래스의 필드가 private 접근자이기때문에
	  System.out.println("도형이름:" +getShapeName() +",너비:"+getWidth()+",높이:"+getHeight());
	 System.out.println("기타정보:"+etc);//private이 아닌 부모필드는 직접 접근할수있다(super.etc생략)
	 System.out.println("count"+count);
  }
  public int getArea() { //*****부모 클래스가 정의한 형식의 메소드를 수정(변경)합니다****:오버라이드
	  return (getHeight()*getWidth())/2;
  }
  public double getAreaDouble() { //같은 이름의 서로 다른(형식) 메소드가 있으면 오류입니다
	  return (double)(getHeight()*getWidth())/2;
}
	
}
