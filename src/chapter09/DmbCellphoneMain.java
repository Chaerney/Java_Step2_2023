package chapter09;

public class DmbCellphoneMain {

	public static void main(String[] args) {
		
		DmbCellphone dmbcellphone=new DmbCellphone("Java폰", "검정", 10);
				
		//Cellphone으로부터 상속받은 필드		
		System.out.println(dmbcellphone.model);
		System.out.println(dmbcellphone.color);
		
		//DmbCellphone의 필드
		System.out.println(dmbcellphone.channel);
		
		System.out.println("- - - - - - - - - - - - - - - - - -");
		//Cellphone의 메서드를 사용하여 전화통화 구현
		dmbcellphone.powerOn();
		dmbcellphone.bell();		
		dmbcellphone.receiveVoice("여보세요~");
		dmbcellphone.sendVoice("왜?");
		dmbcellphone.receiveVoice("언제 와?");
		dmbcellphone.sendVoice("곧");
		dmbcellphone.receiveVoice("빨리 와");
		dmbcellphone.sendVoice("웅");
		dmbcellphone.powerOff();
		System.out.println("- - - - - - - - - - - - - - - - - -");
		//DmbCellphone의 메서드를 사용하여 채널 바꾸기
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(22);
		dmbcellphone.turnOffDmb();
		
		
	}

}
