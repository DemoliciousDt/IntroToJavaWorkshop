package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
	for (int i = 0; i < 1000; i++) {
	String Card=JOptionPane.showInputDialog("Hi user if you would like to advance please put your credit card number.");
	JOptionPane.showMessageDialog(null, "Is "+ Card + " Correct");
	String ans=JOptionPane.showInputDialog("yes or no");
	if(ans.equals("yes")){
		JOptionPane.showMessageDialog(null, "test");
		break;
	}else{
		JOptionPane.showMessageDialog(null, "would you like to retry");
		
			
		}
	}
}
}
