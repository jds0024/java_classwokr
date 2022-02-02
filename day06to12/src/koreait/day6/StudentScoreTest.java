package koreait.day6;

public class StudentScoreTest {

	public static void main(String[] args) {
		//작성자 정다산 22/1/5
		
		StudentScore dasan =new StudentScore();
		dasan.inputData();
		StudentScore jds = new StudentScore();
		jds.inputData();
		StudentScore abc= new StudentScore();
		abc.inputData();
		
		dasan.printScore();
		System.out.println(dasan.sum());
		System.out.println(dasan.avg());
		jds.printScore();
		System.out.println(jds.sum());
		System.out.println(jds.avg());
		abc.printScore();
		System.out.println(abc.sum());
		System.out.println(abc.avg());
		
		
		
		
		
		
		
		
		
				
	}

}
