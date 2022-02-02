package day16_interfac;


//이 클래스는 인터페이스를 InterfaceA를사용합니다.
public class MyClassA implements InterfaceA{
	
	
	//InterfaceA 에 선언된 추상메소드를 구현하는것이 핵심입니다
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("MyClassA-methodA 실행");
		
	}@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		System.out.println("MyClassA-methodA 실행(arg:"+num+")");
		;return num+10;
	}
	
	
	

}
