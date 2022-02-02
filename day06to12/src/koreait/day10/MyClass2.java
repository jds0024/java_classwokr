package koreait.day10;

public class MyClass2 {
// 접근권한 연습
	private int age;		//private :다른 클래스에서 사용못함 . 나(현재 클래스)만쓰겠다
	String name;			//default(package) :다른 패키지에서 사용 못함. 이웃이면 같이 쓰자
	public int score;		//public  :어디서나 쓸수 있음,공공의,공용의...다같이 쓰자
//	 MyClass2() {}
	//이렇게 수정하면 다른패키지에서 객체 생성을 못함
	//생성자 메소드:public,default에 따라 접근권한 설정할수 있음.기본생성자메소드 (자동으로 숨어있는)접근권한은 public
//		
	
	
	
	}

