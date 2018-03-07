package loops;
 
import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	String yearborn = JOptionPane.showInputDialog("What year were you born in?");
	int yearborn1 = Integer.parseInt(yearborn);
	for (int yearsalive = 2018; yearsalive > yearborn1 - 1; yearsalive--) {
		System.out.println(yearsalive);
	}
	
	
	
	
	
	
	
	
	
}
}
