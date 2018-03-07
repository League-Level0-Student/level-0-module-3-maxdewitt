package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String areuhappy = JOptionPane.showInputDialog("Are you happy?");
	String douwanttobehappy = "";
	if (areuhappy.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if (areuhappy.equalsIgnoreCase("No")) {
	     douwanttobehappy = JOptionPane.showInputDialog("Do you want to be happy?");
	
    if (douwanttobehappy.equalsIgnoreCase("Yes")) {
    	JOptionPane.showMessageDialog(null, "Change something.");
    	
    }
    else if (douwanttobehappy.equalsIgnoreCase("No")){
    	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
    }
	}	
	else {
		JOptionPane.showMessageDialog(null, "That isn't a valid answer.");
	}
}
}
