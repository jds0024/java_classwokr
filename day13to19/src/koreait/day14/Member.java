package day14;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 <"+name+"> 회원님 환영합니다");
	}
	
	//회원이 분양받습니다.회원나이 강아지는 15세 이상,고양이는 18세이상, 토끼는 13세이상 분양받을 수 있다
	//(처리조건)
	boolean isAdopt(Animal animal) { //Animal 자식클래스 Puppy.Cat,Rabbit 객체가 animal변수로 참조하게 됩니다
		//현재 회원객체가 인자로 전달받은 animal 객체를 분양받을 작겨이 되는지 반환값을 결정한다.
		//instanceof연산 :구체화된 객체 타입을 검사합니다.자식클래스 객체들에게 사용하는 연산.
		if(animal instanceof Puppy&& this.age>=15)return true;
		else if(animal instanceof Cat &&this.age>=18)return true;
		else if(animal instanceof Rabbit &&this.age>=13)return true;
		else
			return false;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

