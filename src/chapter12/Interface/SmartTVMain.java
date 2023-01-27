package chapter12.Interface;

public class SmartTVMain {

	public static void main(String[] args) {
		
		SmartTV tv=new SmartTV();
		
		tv.turnOn();
		tv.setVolume(3);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("==================");
		
		//Remote 클래스에 정의 되어 있는 메서드만 오버라이딩이 인식되어 사용할 수 있음
		Remote rc=tv;
		rc.turnOn();
		rc.setVolume(-3);
		rc.turnOff();
		//rc.search("www.naver.com");
		
		Searchable sc=tv;
		//sc.turnOn();
		//sc.setVolume(-3);
		//sc.turnOff();
		sc.search("www.naver.com");

	}

}
