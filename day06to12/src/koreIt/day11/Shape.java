package koreIt.day11;

public class Shape {			//상위 클래스 ->상속받은 클래스는 Triangle, Square
	
	static final int MAX_WIDTH=100;				//변하지 않는값. 모든 객체가 같은 값 사용(static)  -->상수
	static final int MAX_HEIGHT =200;
  private String shapeName;   //도형이름
  private int width;       //도형의 크기 중 너비
  private int height;			//높이
  String etc="연습용";	//기타정보-기본접근자(패키지 같은 클래스에 사용할수있음)
  protected int count=12;	//자식클래스이면 어느 패키지 이든지 사용할수 있따
  
  //필드 초기화 생성자:필드 값은 생성자로만 설정합니다(예시: 요구조건은 초기화된 필드값은 변경X)
  public Shape(String shapeName,int width ,int height) {
	  this.shapeName=shapeName;
	  this.width =width;
	  this.height=height;
	  }
  //getter 메소드만 허용하도록 합니다 (setter허용 안합니다):예시 예시: 요구조건은 초기화된 필드값은 변경X
  public int getHeight() {
	return height;
}
  public String getShapeName() {
	return shapeName;
}
  public int getWidth() {
	return width;
} 
  //넓이를 구해서 리턴해주는 메소드 :getArea
  
  public int getArea(){
	  return (width*height);
  }
}
