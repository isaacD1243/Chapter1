package excercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int QTS_IN_Gallons = 4;
		 int numberofQuartsNeeded;
		 int numberofGallons;
		 int numberofQuarts;
		
		 
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("How many quarts do you need? >> ");
			numberofQuartsNeeded = input.nextInt();
			
			
		numberofGallons = numberofQuartsNeeded / QTS_IN_Gallons;
			 
		numberofQuarts = numberofQuartsNeeded % QTS_IN_Gallons;
		
		System.out.println("You need " + numberofQuartsNeeded + " quatrts so you have "
				+ numberofGallons + " gallons and " + numberofQuarts + " quarts ");
	}

}
