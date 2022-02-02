package koreIt.day11a;

import koreIt.day11.Shape;

public class Triangle2 extends Shape {
 public Triangle2(String shapeName, int width, int height) {
	super(shapeName,width,height);
	//Shape 클래스에는 기본생성자 없고 커스텀 생성자만있음 case:B
}
  public void print() {//getShapeName()이렇게 써야하는이유:Shape클래스의 필드가 private 접근자이기때문에
	  System.out.println("도형이름:" +getShapeName() +",너비:"+getWidth()+",높이:"+getHeight());
	 //System.out.println("기타정보:"+etc); 다른패키지 클래스의 기본접근자 필드는 사용 못합니다
	 System.out.println("count"+count);//다른패키지 클래스 이지만 자식클래스이므로 사용합니다
  }
  public int getArea() { //*****부모 클래스가 정의한 형식의 메소드를 수정(변경)합니다****:오버라이드
	  return (getHeight()*getWidth())/2;
  }
  public double getAreaDouble() { //같은 이름의 서로 다른(형식) 메소드가 있으면 오류입니다
	  return (double)(getHeight()*getWidth())/2;
}
	
}
