package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//작성자 :정다산
public static void main(String[] args) {
	ArrayList<Animal> animals =new ArrayList<>();	
	animals.add(new Puppy("브라우니","Brown"));
	animals.add(new Cat());
	animals.add(new Rabbit("바니바니","White"));
	animals.get(1).setName("냥이");
	animals.get(1).setColor("Black");
	animals.add(new Puppy());
	
	System.out.println(" [[환영합니다.반려동물을 보여드리겠습니다.]]\n");
	for (int i = 0; i < animals.size(); i++) {
		System.out.println(i+":"+animals.get(i));
	}
	System.out.println("[[우리 동물들의 소리도 들려드리겠습니다]]\n");
	for (int i = 0; i < animals.size(); i++) {
		animals.get(i).sound();
	}
	Member sana =new Member("사나",15);
	Scanner sc=new Scanner(System.in);
	System.out.println("분양을 원하는 아이의 숫자를 선택해주세요. ->");
	int sel =sc.nextInt();
	System.out.println("선택하신"+animals.get(sel)+"는");
	if(sana.isAdopt(animals.get(sel))) {
		System.out.println("분양 가능합니다");
	}else {
		System.out.println("아쉽지만 분양 하실수 없는 나이 입니다.");
	}
}
}
