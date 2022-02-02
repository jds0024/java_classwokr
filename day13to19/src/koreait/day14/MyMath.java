package day14;

public class MyMath {
  //배열에서 최대값, 최소값, 평균을 구하는 메소드를 만들었습니다.
	//->메소드 오버로딩으로 다른 형식의 데이터들을 처리하도록 메소드를 정의 해 봅시다.
	static int arrayMaxValue(int[] array) {
		int max;
		max=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max)
				max=array[i];
		}
		
		return max;
	}
	static double arrayMaxValue(double[] array) {
		double max;
		max=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max)
				max=array[i];
		}
		
		return max;
	}
	
	
	
	
	
	
	
	 
	 static int arrayMinValue(int[] array) {
			int min;
			min=999;
			for (int i = 0; i < array.length; i++) {
				if(array[i]<min)
					min=array[i];
			} 
			
			return min;
		}
	//합계를 구하는 메소드 
	static int arraySumValue(int[]array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];			
		}
		return sum;
	}
	static double arraySumValue(double[]array) {
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];			
		}
		return sum;
	}

	static double arrayAvgValue(int[]array) {
		double avg;
		avg=(double)arraySumValue(array)/array.length;
		return avg;
	}
	static double arrayAvgValue(double[]array) {
		double avg;
		avg=arraySumValue(array)/array.length;
		return avg;
	}
	
}
