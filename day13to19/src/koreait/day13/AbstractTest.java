package koreaIt.day13;

public class AbstractTest {

	public static void main(String[] args) {

			//AShape ash = new AShape();		추상클래스는 new 로 객체 생성 못합-->오류
		AShape tri = new ATriangle();
		tri.setShapeName("작은 삼각형1");
		
		ATriangle atri =(ATriangle) tri;
		atri.setWidth(20);
		atri.setHeight(40);
		System.out.println("넓이 1:"+tri.getArea()); //부모클래스의 추상메소드 ->구체화된 메소드가 실행됩니다
		System.out.println("넓이 2:"+atri.getArea());//부모클래스에서 정의한 메소드는 자식클래스에서하던 부모클래스에서하든 결과동일
		
		//새로만든 triangle()메소드느 ? 어떤 참조변수로 실행할까요?
		System.out.println("테스트 메소드 실행"+atri.triangel());
		
		
		ASquare square = new ASquare();
		square.setShapeName("중간정사각형");
		ASquare asq = (ASquare)square;
		System.out.println("테스트 메소드 실행"+asq.square());
		
		asq.setWidth(30);
		System.out.println("넓이1:"+square.getArea());
		System.out.println("넓이2:"+asq.getArea());
		
		AShape[] shapes =new AShape[3]; 	//ArrayList 사용도 가능
		//shapes 동일한 배열에 서로 다른 자식객체롤 참조하게 됩니다
		shapes[0]= new ATriangle();
		shapes[1]= new ASquare();
		shapes[2]= new ATriangle();
		
		//ATriangle t =(ATriangle)shapes[1]; //오류 발생 :만들어진 객체와 다른타입으로 캐스팅 못함
		ATriangle t =(ATriangle)shapes[2]; //정상실행 : 만들어진 객체와 참조타입이 일지
		
	for (int i = 0; i < shapes.length; i++) {
			ATriangle at; 
			ASquare as;
			if(shapes[i] instanceof ATriangle) {
				//shapes[i]가 참조한느 객체가 ATriangle객체인지 검사합니다 :instanceof 연산자
				at=(ATriangle)shapes[i];
			at.setWidth(100); at.setHeight(50);}
			else if(shapes[i] instanceof ASquare) {
				//shapes[i]가 참조한느 객체가 ASquare객체인지 검사합니다 :instanceof 연산자
				as = (ASquare)shapes[i];
		as.setWidth(90);
			}
		
		
		
		double temp =shapes[i].getArea();
		System.out.println("넓이 shapes["+i+"]"+temp);
	}//for end
		
		
		
	}

}
