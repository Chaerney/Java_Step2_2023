package chapter13;

class Outer2 {
	//방법1
	//익명의 클래스는 인스턴스 이름이 없다
	Runnable getRunnable(int i) {
		
		int num=111;
		//new와 동시에 부모 클래스의 run메서드를 상속받으므로 추상 메서드인 run을 반드시 오버라이딩해서 사용함
		return new Runnable() {
			
			@Override
			public void run() {
				//i=10;
				//num=200;
				System.out.println(i);
				System.out.println(num);
				
			}
		}; //return
	}//getRunnable
	//방법2 권장
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
			
		}
	};
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outer2 out=new Outer2();
		Runnable runnable = out.getRunnable(22);
		runnable.run(); //방법1
		out.runner.run(); //방법2
		

	}

}
