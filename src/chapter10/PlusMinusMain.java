package chapter10;

import java.util.Scanner;

public class PlusMinusMain {

	public static void main(String[] args) {
		/*
		Scanner s=new Scanner(System.in);
		System.out.print("n1 ==> ");
		int n1=s.nextInt();
		System.out.print("n2 ==> ");
		int n2=s.nextInt();
		
		CalPlus cp=new CalPlus();
		System.out.println(cp.getResult(n1, n2));
		CalMinus cm=new CalMinus();
		System.out.println(cm.getResult(n1, n2));
		*/
		int plus= calc(new CalPlus(), 20, 10);
		int minus=calc(new CalMinus(), 20, 10);
		
		
		
		
		
	}
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}
}
