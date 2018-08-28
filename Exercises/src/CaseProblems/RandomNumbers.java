package CaseProblems;
import javax.swing.JOptionPane;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "The number is"+
			(1 + (int)(Math.random()	* 10)));
	}

}
