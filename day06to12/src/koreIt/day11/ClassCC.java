package koreIt.day11;

public class ClassCC extends ClassC{
	int cc; //자식클래스만의 필드
// public ClassCC(int c) {
//	 super(c) //부모 클래스의 생성자 호출
//}오류
 public ClassCC(int cc) {
	 this.cc=cc; 
//super():부모 클래스 생성자 class(C)호출	
//super(c)		"		class(int C)호출	 	

}
}
