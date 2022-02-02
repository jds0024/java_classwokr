package koreaIt.day13;

public class AbstractTest2 {

	public static void main(String[] args) {
//추상클래스 타입으로 배열을 선언하고 자식클래스객체를 참조하는 예제입니다
		
		
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
