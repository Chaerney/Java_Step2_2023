package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen = new Gen();
		
		//정수형
		Integer[] iArr = {1,2,3,4,5};
		//더블형
		Double[] dArr = {1.2, 2.2, 3.2, 4.2, 5.2};
		//문자형
		Character[] cArr = {'A','B','C','D','E'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
		
		
	}

}
