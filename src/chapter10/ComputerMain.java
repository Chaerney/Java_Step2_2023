package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		int r=10;
		Calculator calc=new Calculator();		
		System.out.println(calc.areaCircle(r));
		System.out.println("- - - - - - - - - - - - -");
		Computer comp=new Computer();
		System.out.println(comp.areaCircle(r));
		
		/*자식만
		Calculator cc=new Computer();
		System.out.println(cc.areaCircle(r));
		*/
	}

}
