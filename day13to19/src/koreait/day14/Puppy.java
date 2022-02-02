package day14;

public class Puppy extends Animal{

static final String Type="강아지";

public Puppy() {
	
}

public Puppy(String name, String color) {
	super(name,color);
}

@Override
	public void sound() {//인스턴스 메소드는 현재 객체의 인스턴스 필드값으로 처리를 합니다
		//추상메소드 구현합니다.
		System.out.println("강아지는 멍멍하고 짖습니다");
	}
@Override
	public String toString() {
	
		return super.toString()+Type; //super는 Animal 클래스의 toString
	}

}
