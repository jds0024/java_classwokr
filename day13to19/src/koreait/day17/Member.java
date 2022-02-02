package koreIt.day17;

public class Member {//Member 타입은 비교가능한 객체가아님->sort할때 Comparator(비교자)인자로 전달해야합니다

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 <"+name+"> 회원님 환영합니다");
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

