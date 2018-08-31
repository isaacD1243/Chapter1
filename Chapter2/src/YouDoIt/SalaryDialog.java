package YouDoIt;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString;
		String dependentString;
		
		double wage;
		double weeklyPay;
		int dependent;
		final double HOURS_IN_WEEK =37.5;
		
		wageString = JOptionPane.showInputDialog(null, "Enter employee's Hourly wage", 
				"Salaey DIolog 1", JOptionPane.INFORMATION_MESSAGE);
		
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		dependentString = JOptionPane.showInputDialog(null, "How many depenents?", 
				"Salary Dialog", JOptionPane.QUESTION_MESSAGE);
		dependent = Integer.parseInt(dependentString);
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + 
				"\nDepductions will be made for" + dependent + " dependents. ");
		
		
		
	}

}
