package chapter10;

public class SupersonicAirplane extends Airplane {
	
	//normal=1 supersonic=2
	//필드(전역변수, 변경할 수 없게 선언)
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;	
	public int flyMode=NORMAL; //1
	
	
	//오버라이딩을 이용하여 flyMode가 SUPERSONIC이면 초음속 비행입니다 그렇지 않으면 Airplane의 fly를 실행한다
	@Override
	public void fly() {
		if (flyMode==SUPERSONIC) {
			System.out.println("초음속비행입니다");
		} else {
			super.fly();
		}		
	}//fly()
	
	
	
	
}
