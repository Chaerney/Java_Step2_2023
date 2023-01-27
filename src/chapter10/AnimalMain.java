package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		
		System.out.println("- - - 곰 - - -");
		Bear b=new Bear();
		System.out.println("눈의 개수 : "+b.getEye());
		System.out.println("다리의 개수 : "+b.getLeg());
		
		System.out.println("- - - 사자 - - -");
		Lion l=new Lion();
		System.out.println("눈의 개수 : "+l.getEye());
		System.out.println("다리의 개수 : "+l.getLeg());
		
		System.out.println("- - - 거미 - - -");
		Animal animal2=new Spider();
		System.out.println("눈의 개수 : "+animal2.getEye());
		System.out.println("다리의 개수 : "+animal2.getLeg());
	

	}

}
