package chapter13;

class Outer {
	//외부 클래스 멤버변수
	int outNum=100;
	static int sNum=200;
	
	//Runnable 매개변수와 멤버변수는 final로 정의된다
	//Runnable은 Data영역으로 들어가며 익명의 클래스라고 한다
	Runnable getRunnable(int i) {
		int num=100;
		
		class MyRunnable implements Runnable {
			int localNum=125;
			
			@Override
			public void run() {
				//num=123; //final
				//i=19; //final
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
				System.out.println("outNum="+outNum+"(외부)");
				
				System.out.println("outer.sNum"+Outer.sNum+"(외부Data영역)");
				
			}//run메서드
			
		}//runnable
		
		return new MyRunnable();
		
	}
}


public class LocalInner2 {

	public static void main(String[] args) {
		Outer out=new Outer();
		Runnable runner=out.getRunnable(10);
		runner.run();

	}

}
