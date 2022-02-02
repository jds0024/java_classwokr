package koreait.day4;

public class SumTest {
public static void main(String[] args) {
	int sum=0; //반드시 초기화 필요
	for (int i = 1; i <=100; i++) {
		sum+=i;
		System.out.println("i="+i+",sum="+sum);
	}System.out.println(sum);
}
}
