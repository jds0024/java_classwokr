package day14;

public abstract class Animal {//abstract메소드 유무 와 상관없이 객체는 직접 생성 못합니다(구체 되지않은상태여서 )
	   							//abstract클래스는abstract메소드를 갖는것이 일반적입니다
								//    ->추상메소드를 자식클래스가 구현하면 구체화됨
								
	static final String Type ="아직모름";
	
		//필드 공통정인 값
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 반려동물이 태어났습니다");
	}
	public Animal (String name) {
		this();		//자기 자신객체의 기본생성자 메소드 호출
		this.name=name;


	}
	public Animal (String name,String color) {
		this(name);
		this.color=color;
	}
	
	//추상메소드
	public abstract void  sound();
	
	//Object 클래스의 toString()메소드 오버라이드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]-type:";
	}//Type필드를값을 여기서 출력하면  이 코드가 잇는 Animal의 Type이 출력됨
	//자식클래스의 Type필드값을 출력 안함.결론 Type 필드는 각각 자식클래스toString에수 출력합니다
	
	
	
	
	
	
	//getter.setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
