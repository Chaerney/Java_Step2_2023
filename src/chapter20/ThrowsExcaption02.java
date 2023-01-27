package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcaption02 {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
		
	public static void main(String[] args) {
		
		ThrowsExcaption02 test = new ThrowsExcaption02();
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException  | ClassNotFoundException e ) { //논리연산자, 관계연산자 사용 가능
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
