package excercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum;
		int secondNum;
		int total; 
		String name;
		Scanner inputDevice  = new Scanner(System.in);
		
		System.out.println("What is your name? >>");
		name = inputDevice.next();
		
		System.out.println("Please eenter a number >>");
		firstNum = inputDevice.nextInt(); 
		
		System.out.println("Please enter a number >>");
		secondNum = inputDevice.nextInt();
		
		total = firstNum + secondNum;
		
		System.out.println("The answer is " + total);
		System.out.println("your name is " + name);
	}

}
