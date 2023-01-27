package chapter13;

import javax.swing.JOptionPane;

class Out2 {
	
	static int a=1;
	int b;
	
	//생성자
	
	//메서드
	
	//내부 클래스
	public static class In{
		
		//필드
		
		//디폴트 생성자
		
		//메서드
		String Infunc() {
			return (a+"번재 static 내부 클래스");
		}//infunc			
	}//in class	
}//out class

public class EmbedMain {

	public static void main(String[] args) {
		
		//static은 클래스명으로 직접 접근이 가능함
		Out2.In obj1=new Out2.In();
		//2. 내부에 있는 메서드
		String str=obj1.Infunc();
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		

	}

}
