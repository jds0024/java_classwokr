package day16_interfac;

//이 클래스는 2개의 인토페이스를 사용하빈다-결론:상속은 다중상속이 불가합니다 .
						//인터페이스는 다중구현이 가능합니다

public class MyClassAB implements InterfaceA,InterfaceB{
	//InterfaceA의 추상메소드 구현
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		return 0;
		//InterfaceB의 추상메소드
	}@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	
}
