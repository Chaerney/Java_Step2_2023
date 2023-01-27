package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcaption01 {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
		
	public static void main(String[] args) {
		
		ThrowsExcaption01 test = new ThrowsExcaption01();
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
