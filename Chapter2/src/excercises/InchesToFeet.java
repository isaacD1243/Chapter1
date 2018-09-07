package excercises;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int INCHES_IN_FEET =12;
		int feet;
		int inches;
		int startingInches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many inches? ");
		startingInches = input.nextInt();
		
		feet = startingInches / INCHES_IN_FEET; 
		inches = startingInches % INCHES_IN_FEET;
		
		System.out.println("You have " + startingInches + "inchesso your total length is " 
				+ feet + " foot " + inches + " inches ");

	}

}
