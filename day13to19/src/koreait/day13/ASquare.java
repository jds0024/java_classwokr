package koreaIt.day13;

public class ASquare extends AShape{
	private int width;
	 
	
	public String square() {
		 return "정사각형";
	 }
	
	
	
	
	//getter
	public int getWidth() {
		return width;
	}//setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
	
	//추상메소드 구현
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*width;
	}

}
