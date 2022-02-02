package koreIt.day11;

public class Puppy extends Animal {
	private String type;
	//생성자 생략 가능하빈다 defalt생성자
	
	public String getType() {
		return type;
	}
	//생성자 생략 가능하빈다 -default 생성자 super 호출합니다
	 public void setType(String type) {
		 this.type =type;
	 }
	 public void test() {
		 System.out.println("Puppy:test 메소드");
	 }
	@Override//@<-어노테이션 :명령실행에 도움을 주는 주석
	void sound() {
		// TODO Auto-generated method stub
		//super.sound();Animal클래스의 sound출력하겠다는 말
		System.out.println("멍멍 합니다");
	}
}
