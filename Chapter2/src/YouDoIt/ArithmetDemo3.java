package YouDoIt;

import java.util.Scanner;
public class ArithmetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a interger >> ");
		firstNumber = input.nextInt();
		
		System.out.println("Please enter a interger >> ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = (double) (sum / 2);
		
		System.out.println(firstNumber + " + " + 
		secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " +
		secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + 
				" and " + secondNumber + " is " + average);
	}

}
