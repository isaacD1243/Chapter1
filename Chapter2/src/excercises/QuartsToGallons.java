package excercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int QTS_IN_Gallons = 4;
		 int numberofQuartsNeeded = 18;
		 int numberofGallons;
		 int numberofQuarts;
		 
		 numberofGallons = numberofQuartsNeeded / QTS_IN_Gallons;
		 
		 numberofQuarts = numberofQuartsNeeded % QTS_IN_Gallons;
		 
		 System.out.println("The number of gallons is " + numberofGallons );
		 
		 System.out.println("The number of quarts remaning is " + numberofQuarts);
		
	}

}
