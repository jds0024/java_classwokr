package day14;

public class Rabbit extends Animal{
	static final String Type="토끼";
	
	public Rabbit() {
		// TODO Auto-generated constructor stub
	}
	public Rabbit(String name,String color) {
		super(name,color);
	}

	
	@Override
	public void sound() {
		System.out.println("토끼는 냠냠 먹을때만 소리납니다");
		
	}
	@Override
	public String toString() {
	
		return super.toString()+Type; //super는 Animal 클래스의 toString
	}	
	
	
	
}
