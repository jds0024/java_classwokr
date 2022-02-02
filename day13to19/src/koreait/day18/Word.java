package koreaIt.day18;

import java.util.List;

public class Word { //객체를 생성하는것이 못적인 클래스(객체:데이터저장,메소드실행이 목적)
	
	private String english;
	private List<String> koreans;//영어 단어 1개에 여러가지 뜻이 있을때 ,,각각list에 add합니다
	private int level;
	
	public Word(String english) {
		this.english=english;
	}
	public Word(String english,List<String> koreans) {
		this(english);
		this.koreans=koreans;	//참조값(주소) 를 전달합니다(인자 값을 필드값으로 대임)
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return english+":"+koreans;
	}
	public List<String> getKoreans() {
		return koreans;
	}public String getEnglish() {
		return english;
	}public void setKoreans(List<String> koreans) {
		this.koreans = koreans;
	}
}
