package koreIt.day11;

public class Animal {
	private String color;
	private String name;
	
	public Animal() {
		System.out.println("Animal:새로운 반려동물 가족이 생겼습니다");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}//인스턴스 메소드 -인스턴스 필드값으로 동작을 합니다
	public void setName(String name) {
		this.name = name;
	}
	void sound(){
		System.out.println("Animal:소리를 내는 동물입니다"+name);
	}
	

}
