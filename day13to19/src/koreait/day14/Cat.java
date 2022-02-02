package day14;

public class Cat extends Animal{
	static final String Type="고양이";
	
	public Cat() {
		
	}
	public Cat(String name,String color) {
		super(name,color);
	}
@Override
public void sound() {
	System.out.println("고양이는 야옹야옹 대화 합니다.");
	}
@Override
public String toString() {

	return super.toString()+Type; //super는 Animal 클래스의 toString
}


}
