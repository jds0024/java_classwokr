package koreait.day10;

public class MyClass3 {
	private int age; 	//private접근권한 이유:외부의  다른클래스에서 이 필드를 직접 변경/읽기 못하게 
						//->데이터를 저장하는 setter(설정),데이터를 가져오는 getter 메소드를 정의
							//age가 다른곳에서 보이지 않아도 데이터를 관리하기위해
	private String name;
	int score;
	//setter
	public void setAge(int age) {
		this.age = age;	//인자로 전달받은 값을 this객체  age필드에 저장합니다
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public int getAge() {
		return age;				//this객체age 필드값을 리턴한다
	}
	public String getName() {
		return name;
	}
	
	//인스턴스 메소드
	public void print() {
		System.out.println("age="+age);
	}
}
