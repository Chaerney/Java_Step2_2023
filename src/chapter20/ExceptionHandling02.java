package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		//try catch 사용
		//fis = new FileInputStream("a.text");
		
		try { //open
			fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try { //close
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finally");
		}
		System.out.println("end");
		
		
		

	}

}
