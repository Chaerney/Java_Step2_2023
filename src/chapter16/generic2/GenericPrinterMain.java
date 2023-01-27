package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> ppw=new GenericPrinter<Powder>();
		ppw.setMaterial(new Powder());	
		Powder powder = ppw.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println();
		
		GenericPrinter<Plastic> pps=new GenericPrinter<Plastic>();
		pps.setMaterial(new Plastic());	
		Plastic plastic = pps.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();
		
		System.out.println();
		
		Water water = new Water();
		water.doPrinting();
		//물의 재료는 허용되면 안 되지만 제네릭의 특성상 허용하는 모순이 발생한다
//		GenericPrinter<Water> w=new GenericPrinter<Water>();
//		w.setMaterial(new Water());	
//		System.out.println(w);
//		
		//내가 원하는 자료의 객체를 만드는 제네릭

		
		

	}

}
